package leetCodingChallenge.year2021.m04april.week4;

/**
 * @author Anna S. Almielka
 * 25.04.2021
 */

public class Day25 {

    /**
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     * <p>
     * Constraints:
     * matrix.length == n
     * matrix[i].length == n
     * 1 <= n <= 20
     * -1000 <= matrix[i][j] <= 1000
     *
     * @param matrix 2D matrix
     */
    public int[][] matrix;

    // Runtime: 0 ms
    // Memory Usage: 38.9 MB
    // Time Complexity: O(n) where n = matrix.length * matrix.length
    // Space Complexity: O(1)
    public void rotate(int[][] matrix) {
        this.matrix = matrix;
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }

    }

}
