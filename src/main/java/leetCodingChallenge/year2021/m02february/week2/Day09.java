package leetCodingChallenge.year2021.m02february.week2;

import leetCode.shared.TreeNode;

/**
 * @author Anna S. Almielka
 * 09.02.2021
 */

public class Day09 {

    /**
     * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree
     * such that every key of the original BST is changed to the original key
     * plus sum of all keys greater than the original key in BST.
     *
     * @param root a Binary Search Tree
     * @return a Greater Tree
     */
    // Time complexity: O(n)
    // Space complexity: O(n)
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

}
