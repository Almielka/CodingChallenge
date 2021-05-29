package leetCodingChallenge.year2021.m05may.week5;

/**
 * @author Anna S. Almielka
 * 29.05.2021
 */

public class Day29 {

    /**
     * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
     * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
     * <p>
     * Constraints:
     * 1 <= n <= 9
     */
    // Runtime: 3 ms
    // Memory Usage: 37.8 MB

    private int count = 0;

    public int totalNQueens(int n) {
        dfs(new int[n], 0);
        return count;
    }

    public void dfs(int[] pos, int step) {
        if (step == pos.length) {
            count++;
            return;
        }
        for (int i = 0; i < pos.length; i++) {
            pos[step] = i;
            if (isValid(pos, step)) {
                dfs(pos, step + 1);
            }
        }
    }

    public boolean isValid(int[] pos, int step) {
        for (int i = 0; i < step; i++) {
            if (pos[i] == pos[step] || (Math.abs(pos[i] - pos[step])) == (step - i)) return false;

        }
        return true;
    }

}

