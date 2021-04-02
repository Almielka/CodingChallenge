package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 02.04.2021
 */

public class Day02 {

    /**
     * You are given an array of binary strings strs and two integers m and n.
     * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
     * A set x is a subset of a set y if all elements of x are also elements of y.
     * <p>
     * Constraints:
     * 1 <= strs.length <= 600
     * 1 <= strs[i].length <= 100
     * strs[i] consists only of digits '0' and '1'.
     * 1 <= m, n <= 100
     *
     * @param strs an array of binary strings
     * @param m    an integer
     * @param n    an integer
     * @return the size of the largest subset
     */
    // Runtime: 32 ms
    // Memory Usage: 38.7 MB
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zeros = 0;
            int ones = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

}
