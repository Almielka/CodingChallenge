package leetCodingChallenge.year2021.m04april.week3;

import java.util.HashMap;
import java.util.Map;

public class Day17 {

    /**
     * Given a matrix and a target, return the number of non-empty submatrices that sum to target.
     * A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.
     * Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different
     * if they have some coordinate that is different: for example, if x1 != x1'.
     * <p>
     * Constraints:
     * 1 <= matrix.length <= 100
     * 1 <= matrix[0].length <= 100
     * -1000 <= matrix[i] <= 1000
     * -10^8 <= target <= 10^8
     *
     * @param matrix a matrix of integers
     * @param target an integer
     * @return the number of non-empty submatrices that sum to {@code target}
     */
    // Runtime: 109 ms
    // Memory Usage: 40 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int length = matrix[0].length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] value : matrix) {
            for (int i = 1; i < length; i++) {
                value[i] += value[i - 1];
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                map.clear();
                map.put(0, 1);
                int sum = 0;
                for (int[] value : matrix) {
                    sum += value[j] - (i > 0 ? value[i - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;
    }

}
