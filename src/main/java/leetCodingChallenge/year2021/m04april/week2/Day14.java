package leetCodingChallenge.year2021.m04april.week2;

import leetCode.shared.ListNode;

public class Day14 {

    /**
     * Given the head of a linked list and a value x, partition it such that all nodes less
     * than x come before nodes greater than or equal to x.
     * You should preserve the original relative order of the nodes in each of the two partitions.
     * <p>
     * Constraints:
     * The number of nodes in the list is in the range [0, 200].
     * -100 <= Node.val <= 100
     * -200 <= x <= 200
     *
     * @param head a head of a linked list
     * @param x    an integer
     * @return
     */
    // Runtime: 0 ms
    // Memory Usage: 38.3 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        ListNode lPoint = lessHead;
        ListNode gPoint = greaterHead;
        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                lPoint.next = node;
                lPoint = lPoint.next;
            } else {
                gPoint.next = node;
                gPoint = gPoint.next;
            }
            node = node.next;
        }
        gPoint.next = null;
        lPoint.next = greaterHead.next;
        return lessHead.next;
    }

}
