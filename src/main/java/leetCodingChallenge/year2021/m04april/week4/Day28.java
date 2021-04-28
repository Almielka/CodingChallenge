package leetCodingChallenge.year2021.m04april.week4;

/**
 * @author Anna S. Almielka
 * 28.04.2021
 */

public class Day28 {

    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * The robot can only move either down or right at any point in time.
     * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     * Now consider if some obstacles are added to the grids. How many unique paths would there be?
     * <p>
     * An obstacle and space is marked as 1 and 0 respectively in the grid.
     * <p>
     * Constraints:
     * m == obstacleGrid.length
     * n == obstacleGrid[i].length
     * 1 <= m, n <= 100
     * obstacleGrid[i][j] is 0 or 1.
     *
     * @param obstacleGrid
     * @return
     */
    // Runtime: 0 ms
    // Memory Usage: 38.4 MB
    // Time Complexity: O(m * n) where m = matrix.length, n = matrix[0].length
    // Space Complexity: O(1)
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] != 1 && !(i == 0 && j == 0)) {
                    dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

}
