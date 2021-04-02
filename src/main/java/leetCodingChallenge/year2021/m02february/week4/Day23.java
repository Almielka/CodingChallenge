package leetCodingChallenge.year2021.m02february.week4;

/**
 * @author Anna S. Almielka
 * 23.02.2021
 */

public class Day23 {

    /**
     * Write an efficient algorithm that searches for a target value in an m x n integer matrix.
     * The matrix has the following properties:
     * Integers in each row are sorted in ascending from left to right.
     * Integers in each column are sorted in ascending from top to bottom.
     *
     * @param matrix a m * n integer matrix
     * @param target an integer
     * @return {@code true} if {@code matrix} contains {@code target},
     * {@code false} otherwise
     */
    // Runtime: 4 ms
    // Memory Usage: 44,4 MB
    // Time complexity: O(n+m)
    // Space complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            int tmp = matrix[row][col];
            if (target > tmp) col++;
            else if (target < tmp) row--;
            else return true;
        }
        return false;

//        for (int[] i : matrix) {
//            for (int k : i) {
//                if (target < k || target > i[i.length - 1]) break;
//                else if (target == k) return true;
//            }
//        }
//        return false;

    }
}


