package leetCodingChallenge.year2021.m03march.week2;

import leetCode.shared.TreeNode;

/**
 * @author Anna S. Almielka
 * 09.03.2021
 */

public class Day09 {

    /**
     * Given the root of a binary tree, then value v and depth d,
     * you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.
     * <p>
     * The adding rule is: given a positive integer depth d, for each NOT null tree nodes N in depth d-1,
     * create two tree nodes with value v as N's left subtree root and right subtree root.
     * And N's original left subtree should be the left subtree of the new left subtree root,
     * its original right subtree should be the right subtree of the new right subtree root.
     * If depth d is 1 that means there is no depth d-1 at all, then create a tree node with value v
     * as the new root of the whole original tree, and the original tree is the new root's left subtree.
     * <p>
     * Note:
     * The given d is in range [1, maximum depth of the given tree + 1].
     * The given binary tree has at least one tree node.
     *
     * @param root of a binary tree
     * @param v    an integer
     * @param d    an integer
     * @return
     */
    // Runtime: 0 ms
    // Memory Usage: 38.9 MB
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            return new TreeNode(v, root, null);
        } else if (d == 2) {
            root.left = new TreeNode(v, root.left, null);
            root.right = new TreeNode(v, null, root.right);
        } else {
            if (root.left != null) {
                addOneRow(root.left, v, d - 1);
            }
            if (root.right != null) {
                addOneRow(root.right, v, d - 1);
            }
        }
        return root;
    }

}

