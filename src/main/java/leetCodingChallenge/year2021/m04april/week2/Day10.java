package leetCodingChallenge.year2021.m04april.week2;

public class Day10 {

    /**
     * Given an m x n integers matrix, return the length of the longest increasing path in matrix.
     * From each cell, you can either move in four directions: left, right, up, or down.
     * You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
     * <p>
     * Constraints:
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 200
     * 0 <= matrix[i][j] <= 2^31 - 1
     *
     * @param matrix an m x n integers matrix
     * @return the length of the longest increasing path in matrix
     */
    private int[][] grid;
    private int m;
    private int n;

    // Runtime: 6 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n * m)
    // Space Complexity: O(m * n)
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        m = matrix.length;
        n = matrix[0].length;
        grid = matrix;
        int max = 0;
        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(i, j, paths));
            }
        }
        return max;
    }

    public int dfs(int i, int j, int[][] paths) {
        if (paths[i][j] > 0) return paths[i][j];
        int value = grid[i][j];
        int down = 0;
        int up = 0;
        int right = 0;
        int left = 0;
        if (i < m - 1 && grid[i + 1][j] < value) {
            down = dfs(i + 1, j, paths);
        }
        if (i > 0 && grid[i - 1][j] < value) {
            up = dfs(i - 1, j, paths);
        }
        if (j < n - 1 && grid[i][j + 1] < value) {
            right = dfs(i, j + 1, paths);
        }
        if (j > 0 && grid[i][j - 1] < value) {
            left = dfs(i, j - 1, paths);
        }
        paths[i][j] = 1 + Math.max(Math.max(down, up), Math.max(right, left));
        return paths[i][j];
    }

}
