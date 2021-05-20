package leetCodingChallenge.year2021.m05may.week3;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day20Test {

    private Day20 day;

    @BeforeEach
    void setUp() {
        day = new Day20();
    }

    @Test
    void testLevelOrder() {
        // Input: root = [3,9,20,null,null,15,7]
        // Output: [[3],[9,20],[15,7]].
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(3));
        result.add(Arrays.asList(9, 20));
        result.add(Arrays.asList(15, 7));
        assertThat(day.levelOrder(root), is(equalTo(result)));
    }

    @Test
    void testLevelOrder2() {
        // Input: root = [[1,2,3,4,null,null,5]]
        // Output: [[1],[2,3],[4,5]]
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, null, new TreeNode(5)));
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        result.add(Arrays.asList(2, 3));
        result.add(Arrays.asList(4, 5));
        assertThat(day.levelOrder(root), is(equalTo(result)));
    }

    @Test
    void testLevelOrder3() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        assertThat(day.levelOrder(root), is(equalTo(result)));
    }

    @Test
    void testLevelOrder4() {
        TreeNode root = null;
        List<List<Integer>> result = new ArrayList<>();
        assertThat(day.levelOrder(root), is(equalTo(result)));
    }

}