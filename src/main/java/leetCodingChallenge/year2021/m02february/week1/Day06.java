package leetCodingChallenge.year2021.m02february.week1;

import leetCode.shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 06.02.2021
 */

public class Day06 {

    /**
     * Given a binary tree, imagine yourself standing on the right side of it,
     * return the values of the nodes you can see ordered from top to bottom.
     *
     * @param root a binary tree
     * @return the right side of it ordered from top to bottom
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> currentRoots = new ArrayList<>();
        currentRoots.add(root);
        while (!currentRoots.isEmpty()) {
            List<TreeNode> tmpList = new ArrayList<>();
            result.add(currentRoots.get(0).val);
            for (TreeNode currentRoot : currentRoots) {
                if (currentRoot.right != null) {
                    tmpList.add(currentRoot.right);
                }
                if (currentRoot.left != null) {
                    tmpList.add(currentRoot.left);
                }
            }
            currentRoots = tmpList;

        }
        return result;
    }

}
