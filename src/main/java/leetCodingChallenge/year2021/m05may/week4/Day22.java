package leetCodingChallenge.year2021.m05may.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 22.05.2021
 */

public class Day22 {

    /**
     * The n-queens puzzle is the problem of placing n queens on an n x n chessboard
     * such that no two queens attack each other.
     * Given an integer n, return all distinct solutions to the n-queens puzzle.
     * Each solution contains a distinct board configuration of the n-queens' placement,
     * where 'Q' and '.' both indicate a queen and an empty space, respectively.
     * <p>
     * Constraints:
     * 1 <= n <= 9
     */
    // Runtime: 5 ms
    // Memory Usage: 38.9 MB
    // Time Complexity : O(n2)
    // Space Complexity: O(n2)

    private char[][] grid;

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> queens = new ArrayList<>();
        grid = new char[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                grid[y][x] = '.';
            }
        }
        dfs(queens, 0);
        return queens;
    }

    private void dfs(List<List<String>> queens, int row) {
        if (row == grid.length) {
            List<String> possibleResult = resultBuilder();
            queens.add(possibleResult);
            return;
        }
        for (int col = 0; col < grid.length; col++) {
            grid[row][col] = 'Q';
            if (isValidPosition(row, col)) {
                dfs(queens, row + 1);
            }
            grid[row][col] = '.';
        }
    }

    private List<String> resultBuilder() {
        List<String> list = new ArrayList<>();
        for (char[] chars : grid) {
            list.add(new String(chars));
        }
        return list;
    }

    private boolean isValidPosition(int row, int col) {
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < grid.length; x++) {
                if (grid[y][x] == 'Q' && (col == x || Math.abs(row - y) == Math.abs(col - x))) {
                    return false;
                }
            }
        }
        return true;
    }

}
