package leetCodingChallenge.year2021.m04april.week2;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day11Test {

    private Day11 day;

    @BeforeEach
    void setUp() {
        day = new Day11();
    }

    @Test
    void testDeepestLeavesSum() {
        // Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
        // Output: 15
        TreeNode leftRoot = new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5));
        TreeNode rightRoot = new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8)));
        TreeNode root = new TreeNode(1, leftRoot, rightRoot);
        assertThat(day.deepestLeavesSum(root), is(15));
    }

    @Test
    void testDeepestLeavesSum2() {
        // Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        // Output: 19
        TreeNode leftRoot = new TreeNode(7, new TreeNode(2, new TreeNode(9), null),
                new TreeNode(7, new TreeNode(1), new TreeNode(4)));
        TreeNode rightRoot = new TreeNode(9, new TreeNode(1), new TreeNode(3, null, new TreeNode(5)));
        TreeNode root = new TreeNode(6, leftRoot, rightRoot);
        assertThat(day.deepestLeavesSum(root), is(19));
    }

}