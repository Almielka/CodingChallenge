package leetCodingChallenge.year2021.march.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 25.03.2021
 */

public class Day25 {

    /**
     * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
     * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.
     * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
     * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
     * <p>
     * Note:
     * The order of returned grid coordinates does not matter.
     * Both m and n are less than 150.
     *
     * @param matrix an m x n matrix of non-negative integers
     * @return returned grid coordinates
     */
    // Runtime: 3 ms
    // Memory Usage: 40.3 MB
    // Time complexity: O(n2)
    // Space complexity: O(n2)

    private int[][] grid;
    private int x;
    private int y;

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        grid = matrix;
        x = grid.length;
        y = grid[0].length;
        boolean[][] pacific = new boolean[x][y];
        boolean[][] atlantic = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            dfs(i, 0, pacific, 0);
            dfs(i, y - 1, atlantic, 0);
        }
        for (int i = 0; i < y; i++) {
            dfs(0, i, pacific, 0);
            dfs(x - 1, i, atlantic, 0);
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> indexes = new ArrayList<>();
                    indexes.add(i);
                    indexes.add(j);
                    result.add(indexes);
                }
            }
        }
        return result;
    }

    private void dfs(int i, int j, boolean[][] canReach, int prevHeight) {
        if (!isInGrid(i, j) || canReach[i][j] || grid[i][j] < prevHeight) {
            return;
        }
        canReach[i][j] = true;
        dfs(i + 1, j, canReach, grid[i][j]);
        dfs(i - 1, j, canReach, grid[i][j]);
        dfs(i, j - 1, canReach, grid[i][j]);
        dfs(i, j + 1, canReach, grid[i][j]);
    }

    private boolean isInGrid(int i, int j) {
        return i >= 0 && i < x && j >= 0 && j < y;
    }

}

