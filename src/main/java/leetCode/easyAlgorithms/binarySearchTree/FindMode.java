package leetCode.easyAlgorithms.binarySearchTree;

import java.util.*;

/**
 * @author Anna S. Almielka
 */

public class FindMode {

    /**
     * 501.Find Mode in Binary Search Tree
     *
     * Given a binary search tree (BST) with duplicates,
     * find all the mode(s) (the most frequently occurred element) in the given BST.
     *
     * @param root a binary search tree
     * @return an array of integers of the most frequently occurred element
     */
    // Runtime: 8 ms
    // Memory Usage: 40.7 MB
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.putAll(getTreeNode(root, map));

        List<Integer> list = new ArrayList<>();
        Integer max = Collections.max(map.values());
        map.forEach((k, v) -> {
            if (v.equals(max)) list.add(k);
        });

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private Map<Integer, Integer> getTreeNode(TreeNode node, Map<Integer, Integer> map) {
        map.merge(node.val, 1, Integer::sum);
        if (node.left != null) {
            getTreeNode(node.left, map);
        }
        if (node.right != null) {
            getTreeNode(node.right, map);
        }
        return map;
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

