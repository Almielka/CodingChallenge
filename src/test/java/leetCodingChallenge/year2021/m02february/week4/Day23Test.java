package leetCodingChallenge.year2021.m02february.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day23Test {

    private Day23 day;

    @BeforeEach
    void setUp() {
        day = new Day23();
    }

    @Test
    void testSearchMatrix() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        assertThat(day.searchMatrix(matrix, 21), is(equalTo(true)));
    }

    @Test
    void testSearchMatrix2() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        assertThat(day.searchMatrix(matrix, 20), is(equalTo(false)));
    }

}