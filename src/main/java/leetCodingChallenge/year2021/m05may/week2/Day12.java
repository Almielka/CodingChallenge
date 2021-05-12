package leetCodingChallenge.year2021.m05may.week2;

/**
 * @author Anna S. Almielka
 * 12.05.2021
 */

public class Day12 {

    /**
     * Given a 2D matrix matrix, handle multiple queries of the following type:
     * <p>
     * Calculate the sum of the elements of matrix inside the rectangle
     * defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
     * <p>
     * Implement the NumMatrix class:
     * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
     * int sumRegion(int row1, int col1, int row2, int col2)
     * Returns the sum of the elements of matrix inside the rectangle
     * defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 200
     * -10^5 <= matrix[i][j] <= 10^5
     * 0 <= row1 <= row2 < m
     * 0 <= col1 <= col2 < n
     * At most 10^4 calls will be made to sumRegion.
     */
    class NumMatrix {
        private int[][] matrix;

        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        // Runtime: 106 ms
        // Memory Usage: 44.4 MB
        // Time Complexity : O(m * n) where m = row2 - row1, n = col2 - col1
        // Space Complexity: O(1)
        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }
    }

    // Runtime: 11 ms
    // Memory Usage: 44.8 MB
    class NumMatrix2 {
        private int[][] dp;

        public NumMatrix2(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            dp = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j + 1] + matrix[i][j] - dp[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        }
    }
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

}
