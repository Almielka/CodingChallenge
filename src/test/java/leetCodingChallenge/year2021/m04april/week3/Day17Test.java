package leetCodingChallenge.year2021.m04april.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day17Test {

    private Day17 day;

    @BeforeEach
    void setUp() {
        day = new Day17();
    }

    @Test
    void testNumSubmatrixSumTarget() {
        // Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
        // Output: 4
        // Explanation: The four 1x1 submatrices that only contain 0.
        int[][] matrix = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        assertThat(day.numSubmatrixSumTarget(matrix, 0), is(equalTo(4)));
    }

    @Test
    void testNumSubmatrixSumTarget2() {
        // Input: matrix = [[1,-1],[-1,1]], target = 0
        // Output: 5
        // Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
        int[][] matrix = new int[][]{{1, -1}, {-1, 1}};
        assertThat(day.numSubmatrixSumTarget(matrix, 0), is(equalTo(5)));
    }

    @Test
    void testNumSubmatrixSumTarget3() {
        // Input: matrix = [[904]], target = 0
        // Output: 0
        int[][] matrix = new int[][]{{904}};
        assertThat(day.numSubmatrixSumTarget(matrix, 0), is(equalTo(0)));
    }

}