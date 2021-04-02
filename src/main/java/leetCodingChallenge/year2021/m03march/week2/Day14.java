package leetCodingChallenge.year2021.m03march.week2;

import leetCode.shared.ListNode;

/**
 * @author Anna S. Almielka
 * 14.03.2021
 */

public class Day14 {

    /**
     * You are given the head of a linked list, and an integer k.
     * Return the head of the linked list after swapping the values of the kth node
     * from the beginning and the kth node from the end (the list is 1-indexed).
     * <p>
     * Constraints:
     * The number of nodes in the list is n.
     * 1 <= k <= n <= 10^5
     * 0 <= Node.val <= 100
     *
     * @param head the head of a linked list
     * @param k    an integer
     * @return the head of a linked list after swapping
     */
    // Runtime: 2 ms
    // Memory Usage: 64.6 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode swapNodes(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        ListNode first = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode second = slow;

        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

        return head;

    }

}
