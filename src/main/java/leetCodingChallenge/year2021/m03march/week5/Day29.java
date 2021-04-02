package leetCodingChallenge.year2021.m03march.week5;

import leetCode.shared.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 29.03.2021
 */

public class Day29 {

    /**
     * You are given the root of a binary tree with n nodes, where each node is uniquely assigned a value from 1 to n.
     * You are also given a sequence of n values voyage, which is the desired pre-order traversal of the binary tree.
     * <p>
     * Any node in the binary tree can be flipped by swapping its left and right subtrees.
     * For example, flipping node 1 will have the following effect:
     * <p>
     * Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.
     * Return a list of the values of all flipped nodes. You may return the answer in any order.
     * If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage,
     * return the list [-1].
     * <p>
     * Constraints:
     * The number of nodes in the tree is n.
     * n == voyage.length
     * 1 <= n <= 100
     * 1 <= Node.val, voyage[i] <= n
     * All the values in the tree are unique.
     * All the values in voyage are unique.
     *
     * @param root   the root of a binary tree with n nodes
     * @param voyage a sequence of n values
     * @return a list of the values of all flipped nodes
     */
    // Runtime: 0 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    private int index;
    private List<Integer> result = new ArrayList<>();

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        dfs(root, voyage);
        return result;
    }

    private void dfs(TreeNode node, int[] voyage) {
        if (node == null || !result.isEmpty() && result.get(0) == -1) return;
        if (node.val != voyage[index++]) {
            result = new ArrayList<>(Collections.singletonList(-1));
        }
        // We need to check the left node value against the next index of voyage, and if they're not a match, we should account for the flip by updating result
        else if (node.left != null && node.left.val != voyage[index]) {
            result.add(node.val);
            dfs(node.right, voyage);
            dfs(node.left, voyage);
        } else {
            dfs(node.left, voyage);
            dfs(node.right, voyage);
        }
    }

}


