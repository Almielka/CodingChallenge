package leetCodingChallenge.year2021.m04april.week2;

import leetCode.shared.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Day11 {

    /**
     * Given the root of a binary tree, return the sum of values of its deepest leaves.
     * <p>
     * Constraints:
     * The number of nodes in the tree is in the range [1, 10^4].
     * 1 <= Node.val <= 100
     *
     * @param root
     * @return
     */
    // Runtime: 3 ms
    // Memory Usage: 40 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return sum;
    }

}
