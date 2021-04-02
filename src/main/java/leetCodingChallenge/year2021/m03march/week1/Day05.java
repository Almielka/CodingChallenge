package leetCodingChallenge.year2021.m03march.week1;

import leetCode.shared.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 05.03.2021
 */

public class Day05 {

    /**
     * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
     * <p>
     * Input:
     * 3
     * / \
     * 9   20
     * /  \
     * 15   7
     * Output: [3, 14.5, 11]
     * Explanation:
     * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
     * <p>
     * Note:
     * The range of node's value is in the range of 32-bit signed integer.
     *
     * @param root a non-empty binary tree
     * @return the average value of the nodes on each level
     */
    // Runtime: 2 ms
    // Memory Usage: 40.4 MB
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
            result.add(sum / size);
        }
        return result;
    }

}
