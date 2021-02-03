package leetCodingChallenge.year2021.february.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 03.02.2021
 */

public class Day03 {

    /**
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     * There is a cycle in a linked list if there is some node in the list that can be reached
     * again by continuously following the next pointer.
     * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
     * Note that pos is not passed as a parameter.
     * <p>
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     *
     * @param head the head of a linked list {@code ListNode}
     * @return {@code true} if there is a cycle in the linked list {@code ListNode},
     * {@code false} otherwise
     */
    // Time complexity : O(n)
    // Space complexity: O(n)
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            if (list.contains(head)){
                return true;
            }
            list.add(head);
            head = head.next;
        }
        return false;
    }

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

