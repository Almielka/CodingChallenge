package leetCodingChallenge.year2021.m04april.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day21Test {

    private Day21 day;

    @BeforeEach
    void setUp() {
        day = new Day21();
    }

    @Test
    void testMinimumTotal() {
        // Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
        // Output: 11
        // Explanation: The triangle looks like:
        //    2
        //   3 4
        //  6 5 7
        // 4 1 8 3
        // The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
        List<Integer> list1 = new ArrayList(Arrays.asList(2));
        List<Integer> list2 = new ArrayList(Arrays.asList(3, 4));
        List<Integer> list3 = new ArrayList(Arrays.asList(6, 5, 7));
        List<Integer> list4 = new ArrayList(Arrays.asList(4, 1, 8, 3));
        List<List<Integer>> triangle = new ArrayList(Arrays.asList(list1, list2, list3, list4));
        assertThat(day.minimumTotal(triangle), is(11));
    }

    @Test
    void testMinimumTotal2() {
        List<Integer> list1 = new ArrayList(Arrays.asList(-10));
        List<List<Integer>> triangle = new ArrayList(Arrays.asList(list1));
        assertThat(day.minimumTotal(triangle), is(-10));
    }

    @Test
    void testMinimumTotal3() {
        int[][] arr = {{-1}, {2, 3}, {1, -1, -3}};
        List<Integer> list1 = new ArrayList(Arrays.asList(-1));
        List<Integer> list2 = new ArrayList(Arrays.asList(2, 3));
        List<Integer> list3 = new ArrayList(Arrays.asList(1, -1, -3));
        List<List<Integer>> triangle = new ArrayList(Arrays.asList(list1, list2, list3));
        assertThat(day.minimumTotal(triangle), is(-1));
    }

}