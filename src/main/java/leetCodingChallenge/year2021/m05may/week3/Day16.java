package leetCodingChallenge.year2021.m05may.week3;

import leetCode.shared.TreeNode;


/**
 * @author Anna S. Almielka
 * 16.05.2021
 */

public class Day16 {

    /**
     * Given a binary tree, we install cameras on the nodes of the tree.
     * Each camera at a node can monitor its parent, itself, and its immediate children.
     * Calculate the minimum number of cameras needed to monitor all nodes of the tree.
     * <p>
     * Note:
     * The number of nodes in the given tree will be in the range [1, 1000].
     * Every node has value 0.
     *
     * @param root a binary tree
     * @return the minimum number of cameras
     */

    private int ans = 0;

    // Runtime: 0 ms
    // Memory Usage: 38.7 MB
    // Time Complexity : O(n)
    // Space Complexity: O(k) where k is the maximum depth bst
    public int minCameraCover(TreeNode root) {
        return dfs(root) > 2 ? ans + 1 : ans;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int value = dfs(node.left) + dfs(node.right);
        if (value == 0) return 3;
        if (value < 3) return 0;
        ans++;
        return 1;
    }

}
