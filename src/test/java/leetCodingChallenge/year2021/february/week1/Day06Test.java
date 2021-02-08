package leetCodingChallenge.year2021.february.week1;

import leetCodingChallenge.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day06Test {

    private Day06 day;

    @BeforeEach
    void setUp() {
        day = new Day06();
    }

    @Test
    void testRightSideView() {
        // Input: [1,2,3,null,5,null,4]
        //          1
        //       /    \
        //      2       3
        //       \        \
        //         5        4
        // Output: [1, 3, 4]
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        List<Integer> result = Arrays.asList(1, 3, 4);
        assertThat(day.rightSideView(root), is(equalTo(result)));
    }

    @Test
    void testRightSideView2() {
        // Input: []
        // Output: []
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<Integer> result = Arrays.asList(1, 2);
        assertThat(day.rightSideView(root), is(equalTo(result)));
    }

    @Test
    void testRightSideView3() {
        // Input: [1,2,3,4]
        //          1
        //       /    \
        //      2       3
        //     /
        //    4
        // Output: [1,3,4]
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        List<Integer> result = Arrays.asList(1, 3, 4);
        assertThat(day.rightSideView(root), is(equalTo(result)));
    }

}