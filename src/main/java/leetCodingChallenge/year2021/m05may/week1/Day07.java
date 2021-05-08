package leetCodingChallenge.year2021.m05may.week1;

/**
 * @author Anna S. Almielka
 * 07.05.2021
 */

public class Day07 {

    /**
     * Given two strings word1 and word2, return the minimum number of steps
     * required to make word1 and word2 the same.
     * In one step, you can delete exactly one character in either string.
     * <p>
     * Constraints:
     * 1 <= word1.length, word2.length <= 500
     * word1 and word2 consist of only lowercase English letters.
     *
     * @param word1 a string
     * @param word2 a string
     * @return the minimum number of steps required to make  {@code word1} and {@code word2} the same.
     */
    // Runtime: 7 ms
    // Memory Usage: 39.6 MB
    // Time Complexity : O(n * m) where n = word2.length(), m = word1.length()
    // Space Complexity: O(n)
    public int minDistance(String word1, String word2) {
        int[] dp = new int[word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            int[] tmp = new int[word2.length() + 1];
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0) {
                    tmp[j] = i + j;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    tmp[j] = dp[j - 1];
                } else {
                    tmp[j] = 1 + Math.min(dp[j], tmp[j - 1]);
                }
            }
            dp = tmp;
        }
        return dp[word2.length()];
    }

}
