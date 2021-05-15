package leetCodingChallenge.year2021.m05may.week2;

import leetCode.shared.TreeNode;

/**
 * @author Anna S. Almielka
 * 14.05.2021
 */

public class Day14 {

    /**
     * Given the root of a binary tree, flatten the tree into a "linked list":
     * <p>
     * The "linked list" should use the same TreeNode class where the right
     * child pointer points to the next node in the list and the left child pointer is always null.
     * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
     * <p>
     * Constraints:
     * The number of nodes in the tree is in the range [0, 2000].
     * -100 <= Node.val <= 100
     * <p>
     * Follow up: Can you flatten the tree in-place (with O(1) extra space)?
     *
     * @param root the root of binary tree
     */
    // Runtime: 0 ms
    // Memory Usage: 38.7 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode treeNode = curr.left;
                while (treeNode.right != null) {
                    treeNode = treeNode.right;
                }
                treeNode.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

}
