package leetCodingChallenge.year2021.m04april.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day28Test {

    private Day28 day;

    @BeforeEach
    void setUp() {
        day = new Day28();
    }

    @Test
    void testUniquePathsWithObstacles() {
        // Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
        // Output: 2
        // Explanation: There is one obstacle in the middle of the 3x3 grid above.
        // There are two ways to reach the bottom-right corner:
        // 1. Right -> Right -> Down -> Down
        // 2. Down -> Down -> Right -> Right
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertThat(day.uniquePathsWithObstacles(obstacleGrid), is(equalTo(2)));
    }

    @Test
    void testUniquePathsWithObstacles2() {
        int[][] obstacleGrid = new int[][]{{0, 1}, {0, 0}};
        assertThat(day.uniquePathsWithObstacles(obstacleGrid), is(equalTo(1)));
    }

}