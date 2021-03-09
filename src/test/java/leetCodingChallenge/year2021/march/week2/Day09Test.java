package leetCodingChallenge.year2021.march.week2;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day09Test {

    private Day09 day;

    @BeforeEach
    void setUp() {
        day = new Day09();
    }

    @Test
    void testAddOneRow() {
        // Input:
        //A binary tree as following:
        //       4
        //     /   \
        //    2     6
        //   / \   /
        //  3   1 5
        //
        //v = 1
        //
        //d = 2
        //
        //Output:
        //       4
        //      / \
        //     1   1
        //    /     \
        //   2       6
        //  / \     /
        // 3   1   5
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5), null));
        TreeNode result = new TreeNode(4,
                new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null),
                new TreeNode(1, null, new TreeNode(6, new TreeNode(5), null)));
        assertThat(day.addOneRow(root, 1, 2), is(equalTo(result)));
    }

    @Test
    void testAddOneRow2() {
        // Input:
        //A binary tree as following:
        //      4
        //     /
        //    2
        //   / \
        //  3   1
        //
        //v = 1
        //
        //d = 3
        //
        //Output:
        //      4
        //     /
        //    2
        //   / \
        //  1   1
        // /     \
        //3       1
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null);
        TreeNode result = new TreeNode(4, new TreeNode(2,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(1, null, new TreeNode(1))), null);
        assertThat(day.addOneRow(root, 1, 3), is(equalTo(result)));
    }

}