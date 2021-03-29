package leetCodingChallenge.year2021.march.week5;

import leetCode.shared.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day29Test {

    private Day29 day;

    @BeforeEach
    void setUp() {
        day = new Day29();
    }

    @Test
    void testFlipMatchVoyage() {
        //     1
        //   /
        // 2
        // Input: root = [1,2], voyage = [2,1]
        // Output: [-1]
        // Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        int[] voyage = {2, 1};
        int[] arr = {-1};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.flipMatchVoyage(root, voyage), is(equalTo(result)));
    }

    @Test
    void testFlipMatchVoyage2() {
        //     1
        //   /  \
        // 2      3
        // Input: root = [1,2,3], voyage = [1,3,2]
        // Output: [1]
        // Explanation: Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int[] voyage = {1, 3, 2};
        int[] arr = {1};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.flipMatchVoyage(root, voyage), is(equalTo(result)));
    }

    @Test
    void testFlipMatchVoyage3() {
        //     1
        //   /  \
        // 2      3
        // Input: root = [1,2,3], voyage = [1,2,3]
        // Output: []
        // Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int[] voyage = {1, 2, 3};
        List<Integer> result = new ArrayList<>();
        assertThat(day.flipMatchVoyage(root, voyage), is(equalTo(result)));
    }

    @Test
    void testFlipMatchVoyage4() {
        //     1
        //   /  \
        // 2      3
        // Input: root = [1,2,3], voyage = [1,2,3]
        // Output: []
        // Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, new TreeNode(4)),
                new TreeNode(6, new TreeNode(5), null)), null);
        int[] voyage = {1,2,6,5,3,4};
        int[] arr = {2};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.flipMatchVoyage(root, voyage), is(equalTo(result)));
    }

}