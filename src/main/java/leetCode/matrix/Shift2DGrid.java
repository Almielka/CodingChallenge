package leetCode.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class Shift2DGrid {

    /**
     * 1260.Shift 2D Grid
     *
     * Given a 2D grid of size m*n and an integer k. You need to shift the grid k times.
     * Return the 2D grid after applying shift operation k times.
     * <p>
     * Example:
     * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
     * Output: [[9,1,2],[3,4,5],[6,7,8]]
     *
     * @param grid a 2D grid of size m*n of integers
     * @param k    an integer
     * @return 2D grid after applying shift operation k times
     */
    // Runtime: 6 ms
    // Memory Usage: 40.2 MB
    // Time Complexity: O(n * m) where n = grid.length, m = grid[0].length
    // Space Complexity: O(n * m)
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int[] nested : grid) {
            for (int v : nested) {
                list.add(v);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(0, list.pollLast());
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] nested : grid) {
            List<Integer> nestedList = new ArrayList<>();
            result.add(nestedList);
            for (int i = 0; i < nested.length; i++) {
                nestedList.add(i, list.remove(0));
            }
        }
        return result;
    }

}


