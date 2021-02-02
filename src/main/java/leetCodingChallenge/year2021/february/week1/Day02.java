package leetCodingChallenge.year2021.february.week1;

/**
 * @author Anna S. Almielka
 * 02.02.2021
 */

public class Day02 {

    /**
     * Given the root of a binary search tree and the lowest and highest boundaries
     * as low and high, trim the tree so that all its elements lies in [low, high].
     * Trimming the tree should not change the relative structure of the elements
     * that will remain in the tree (i.e., any node's descendant should remain a descendant).
     * It can be proven that there is a unique answer.
     * <p>
     * Return the root of the trimmed binary search tree.
     * Note that the root may change depending on the given bounds.
     *
     * @param root a binary search tree
     * @param low  lowest boundary
     * @param high highest boundary
     * @return the root of the trimmed binary search tree
     */
    //Runtime: 0 ms
    //Memory Usage: 39.1 MB
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }


}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}