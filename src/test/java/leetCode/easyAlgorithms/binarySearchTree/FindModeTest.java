package leetCode.easyAlgorithms.binarySearchTree;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FindModeTest {

    @Test
    void findMode() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(2), null);
        int[] result = {2};
        FindMode solution = new FindMode();
        assertThat(solution.findMode(root), is(equalTo(result)));
    }

}