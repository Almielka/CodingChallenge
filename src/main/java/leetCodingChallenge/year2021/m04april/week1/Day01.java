package leetCodingChallenge.year2021.m04april.week1;

import leetCode.shared.ListNode;

/**
 * @author Anna S. Almielka
 * 01.04.2021
 */

public class Day01 {

    /**
     * Given the head of a singly linked list, return true if it is a palindrome.
     * Constraints:
     * The number of nodes in the list is in the range [1, 10^5].
     * 0 <= Node.val <= 9
     *
     * @param head
     * @return
     */
    // Runtime: 13 ms
    // Memory Usage: 59.7 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        String str = builder.toString();
        return builder.reverse().toString().equals(str);
    }

    // Runtime: 4 ms
    // Memory Usage: 49 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    /**
     * Two Pointers
     */
    public boolean isPalindrome2(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode node = reverse(slow); // reverse from half
        while (node != null) {
            if (node.val != head.val) {
                return false;
            }
            node = node.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverse(ListNode slow) {
        ListNode node = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = node;
            node = slow;
            slow = next;
        }
        return node;
    }

}
