package leetCodingChallenge.year2021.m04april.week3;

import java.util.List;

/**
 * @author Anna S. Almielka
 * 21.04.2021
 */

public class Day21 {

    /**
     * Given a triangle array, return the minimum path sum from top to bottom.
     * For each step, you may move to an adjacent number of the row below.
     * More formally, if you are on index i on the current row,
     * you may move to either index i or index i + 1 on the next row.
     * <p>
     * Constraints:
     * 1 <= triangle.length <= 200
     * triangle[0].length == 1
     * triangle[i].length == triangle[i - 1].length + 1
     * -10^4 <= triangle[i][j] <= 10^4
     * <p>
     * Follow up: Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?
     *
     * @param triangle a triangle array
     * @return the minimum path sum from top to bottom
     */
    // Runtime: 4 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                int min = Math.min(triangle.get(i).get(j), triangle.get(i).get(j + 1));
                triangle.get(i - 1).set(j, triangle.get(i - 1).get(j) + min);
            }
        return triangle.get(0).get(0);
    }

}
