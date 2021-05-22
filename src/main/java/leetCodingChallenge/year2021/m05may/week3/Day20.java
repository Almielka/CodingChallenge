package leetCodingChallenge.year2021.m05may.week3;

import leetCode.shared.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 20.05.2021
 */

public class Day20 {

    /***
     * Given the root of a binary tree,
     * return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
     * Constraints:
     * The number of nodes in the tree is in the range [0, 2000].
     * -1000 <= Node.val <= 1000
     *
     * @param root the root of a binary tree
     * @return the level order traversal of its nodes' values
     */
    // Runtime: 0 ms
    // Memory Usage: 38.6 MB
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(tmp);
        }
        return result;
    }

}
