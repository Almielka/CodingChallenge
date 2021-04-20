package leetCodingChallenge.year2021.m04april.week3;

import leetCode.shared.NodeChildren;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anna S. Almielka
 * 20.04.2021
 */

public class Day20 {

    /**
     * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
     * Nary-Tree input serialization is represented in their level order traversal
     * Each group of children is separated by the null value.
     * <p>
     * Constraints:
     * The number of nodes in the tree is in the range [0, 10^4].
     * 0 <= Node.val <= 10^4
     * The height of the n-ary tree is less than or equal to 1000.
     * <p>
     * Follow up: Recursive solution is trivial, could you do it iteratively?
     *
     * @param root the root of an n-ary tree
     * @return the preorder traversal of its nodes' values
     */
    // Runtime: 2 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> preorder(NodeChildren root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<NodeChildren> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            NodeChildren node = stack.pop();
            result.add(node.val);
            if (node.children != null) {
                int size = node.children.size();
                for (int i = size - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return result;
    }

}
