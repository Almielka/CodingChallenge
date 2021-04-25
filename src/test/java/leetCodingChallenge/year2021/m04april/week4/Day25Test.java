package leetCodingChallenge.year2021.m04april.week4;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class Day25Test {

    private Day25 day;

    @BeforeEach
    void setUp() {
        day = new Day25();
    }

    @Test
    void testRotate() {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [[7,4,1],[8,5,2],[9,6,3]]
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        day.rotate(matrix);
        assertThat(day.matrix, Matchers.arrayContaining(expected));
    }

    @Test
    void testRotate2() {
        // Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
        // Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expected = new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        day.rotate(matrix);
        assertThat(day.matrix, Matchers.arrayContaining(expected));
    }

    @Test
    void testRotate3() {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [[7,4,1],[8,5,2],[9,6,3]]
        int[][] matrix = new int[][]{{1}};
        int[][] expected = new int[][]{{1}};
        day.rotate(matrix);
        assertThat(day.matrix, Matchers.arrayContaining(expected));
    }

    @Test
    void testRotate4() {
        // Input: matrix = [[1,2],[3,4]]
        // Output: [[3,1],[4,2]]
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        int[][] expected = new int[][]{{3, 1}, {4, 2}};
        day.rotate(matrix);
        assertThat(day.matrix, Matchers.arrayContaining(expected));
    }

}