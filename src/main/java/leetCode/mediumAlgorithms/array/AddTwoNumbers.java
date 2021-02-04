package leetCode.mediumAlgorithms.array;

import java.util.Objects;

/**
 * @author Anna S. Almielka
 * 11.01.2021
 */

public class AddTwoNumbers {

    /**
     * 02.Add Two Numbers
     *
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * <p>
     * Examples
     * Input:l1 =[2,4,3],l2 =[5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */
    // Runtime: 4 ms
    // Memory Usage: 44.9 MB
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        int dozen = 0;

        while (l1 != null || l2 != null) {
            int value1 = (l1 == null) ? 0 : l1.val;
            int value2 = (l2 == null) ? 0 : l2.val;

            int sum = value1 + value2 + dozen;
            dozen = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;


            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (dozen > 0) {
            currentNode.next = new ListNode((dozen));
        }
        return result.next;
    }

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

}
