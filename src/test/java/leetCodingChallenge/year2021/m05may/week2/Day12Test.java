package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day12Test {

    @Test
    void testNumMatrix() {
        // Input
        // ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
        // [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
        // Output
        // [null, 8, 11, 12]
        //
        // Explanation
        // NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]);
        // numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
        // numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
        // numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)
        int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        Day12.NumMatrix numMatrix = new Day12().new NumMatrix(matrix);
        assertThat(numMatrix.sumRegion(2, 1, 4, 3), is(equalTo(8)));
        assertThat(numMatrix.sumRegion(1, 1, 2, 2), is(equalTo(11)));
        assertThat(numMatrix.sumRegion(1, 2, 2, 4), is(equalTo(12)));
    }

    @Test
    void testNumMatrix2() {
        int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        Day12.NumMatrix2 numMatrix = new Day12().new NumMatrix2(matrix);
        assertThat(numMatrix.sumRegion(2, 1, 4, 3), is(equalTo(8)));
        assertThat(numMatrix.sumRegion(1, 1, 2, 2), is(equalTo(11)));
        assertThat(numMatrix.sumRegion(1, 2, 2, 4), is(equalTo(12)));
    }

}