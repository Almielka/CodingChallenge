package leetCodingChallenge.year2021.march.week1;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day05Test {

    private Day05 day;

    @BeforeEach
    void setUp() {
        day = new Day05();
    }

    @Test
    void testAverageOfLevels() {
        // Input:
        //    3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        // Output: [3, 14.5, 11]
        // Explanation:
        // The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<Double> result = Arrays.asList(3.0, 14.5, 11.0);
        assertThat(day.averageOfLevels(root), is(equalTo(result)));
    }

    @Test
    void testAverageOfLevels2() {
        // Input:
        //         3
        //       /   \
        //     1     5
        //    / \    / \
        //   0   2  4   6
        // Output: [3, 14.5, 11]
        // Explanation:
        // The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
        TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(2)),
                new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        List<Double> result = Arrays.asList(3.0, 3.0, 3.0);
        assertThat(day.averageOfLevels(root), is(equalTo(result)));
    }

}