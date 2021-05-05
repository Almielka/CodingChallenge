package leetCode.listNode;

import leetCode.shared.ListNode;

/**
 * @author Anna S. Almielka
 */

public class RemoveNthNodeFromEndList {

    /**
     * 19.Remove Nth Node From End of List
     *
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     * Follow up: Could you do this in one pass?
     * <p>
     * Constraints:
     * The number of nodes in the list is sz.
     * 1 <= sz <= 30
     * 0 <= Node.val <= 100
     * 1 <= n <= sz
     *
     * @param head a head of linked list
     * @param n an integer number
     * @return the list without the nth node
     */
    // Runtime: 0 ms
    // Memory Usage: 37 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
