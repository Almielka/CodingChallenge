package leetCodingChallenge.year2021.m04april.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day10Test {

    private Day10 day;

    @BeforeEach
    void setUp() {
        day = new Day10();
    }

    @Test
    void testLongestIncreasingPath() {
        // Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
        // Output: 4
        // Explanation: The longest increasing path is [1, 2, 6, 9].
        int[][] matrix = new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}};
        assertThat(day.longestIncreasingPath(matrix), is(equalTo(4)));
    }

    @Test
    void testLongestIncreasingPath2() {
        // Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
        // Output: 4
        // Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
        int[][] matrix = new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}};
        assertThat(day.longestIncreasingPath(matrix), is(equalTo(4)));
    }

    @Test
    void testLongestIncreasingPath3() {
        int[][] matrix = new int[][]{{1}};
        assertThat(day.longestIncreasingPath(matrix), is(equalTo(1)));
    }

}