package leetCode.binarySearchTree;


import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ConvertBSTTest {

    private ConvertBST day;

    @BeforeEach
    void setUp() {
        day = new ConvertBST();
    }

    @Test
    void testConvertBST() {
        // Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        // Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
        TreeNode leftRoot = new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3)));
        TreeNode rightRoot = new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8)));
        TreeNode root = new TreeNode(4, leftRoot, rightRoot);
        TreeNode leftResult = new TreeNode(36, new TreeNode(36), new TreeNode(35, null, new TreeNode(33)));
        TreeNode rightResult = new TreeNode(21, new TreeNode(26), new TreeNode(15, null, new TreeNode(8)));
        TreeNode result = new TreeNode(30, leftResult, rightResult);
        assertThat(day.convertBST(root), is(result));
    }

    @Test
    void testConvertBST2() {
        // Input: root = [0,null,1]
        // Output: [1,null,1]
        TreeNode root = new TreeNode(0, null, new TreeNode(1));
        TreeNode result = new TreeNode(1, null, new TreeNode(1));
        assertThat(day.convertBST(root), is(result));
    }

    @Test
    void testConvertBST3() {
        // Input: root = [1,0,2]
        // Output: [3,3,2]
        TreeNode root = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        TreeNode result = new TreeNode(3, new TreeNode(3), new TreeNode(2));
        assertThat(day.convertBST(root), is(result));
    }

    @Test
    void testConvertBST4() {
        // Input: root = [3,2,4,1]
        // Output: [7,9,4,10]
        TreeNode root = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4));
        TreeNode result = new TreeNode(7, new TreeNode(9, new TreeNode(10), null), new TreeNode(4));
        assertThat(day.convertBST(root), is(result));
    }

}