package leetCodingChallenge.year2021.m05may;

import leetCode.shared.ListNode;
import leetCode.shared.TreeNode;

/**
 * @author Anna S. Almielka
 * 06.05.2021
 */

public class Day06 {

    /**
     * Given the head of a singly linked list where elements are sorted in ascending order,
     * convert it to a height balanced BST.
     * <p>
     * For this problem, a height-balanced binary tree is defined as a binary tree
     * in which the depth of the two subtrees of every node never differ by more than 1.
     * <p>
     * Constraints:
     * The number of nodes in head is in the range [0, 2 * 104].
     * -10^5 <= Node.val <= 10^5
     *
     * @param head the head of a singly linked list
     * @return the converted {@code head} to a height balanced BST
     */
    // Runtime: 0 ms
    // Memory Usage: 39.8 MB
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }

    public TreeNode sortedListToBST(ListNode head, ListNode tail) {
        if (head == null || head == tail) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode bst = new TreeNode(slow.val);
        bst.left = sortedListToBST(head, slow);
        bst.right = sortedListToBST(slow.next, tail);
        return bst;
    }

}
