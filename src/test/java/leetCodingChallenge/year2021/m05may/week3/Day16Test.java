package leetCodingChallenge.year2021.m05may.week3;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day16Test {

    private Day16 day;

    @BeforeEach
    void setUp() {
        day = new Day16();
    }

    @Test
    void testMinCameraCover() {
        // Input: [0,0,null,0,0]
        // Output: 1
        // Explanation: One camera is enough to monitor all nodes if placed as shown.
        TreeNode root = new TreeNode(0,
                new TreeNode(0, new TreeNode(0), new TreeNode(0)),
                null);
        assertThat(day.minCameraCover(root), is(equalTo(1)));
    }

    @Test
    void testMinCameraCover2() {
        // Input: [0,0,null,0,null,0,null,null,0]
        // Output: 2
        // Explanation: At least two cameras are needed to monitor all nodes of the tree.
        // The above image shows one of the valid configurations of camera placement.
        TreeNode root = new TreeNode(0,
                new TreeNode(0, new TreeNode(0, new TreeNode(0,
                        null, new TreeNode(0)), null), null),
                null);
        assertThat(day.minCameraCover(root), is(equalTo(2)));
    }

}