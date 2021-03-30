package leetCodingChallenge.year2021.march.week5;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class Day30 {

    /**
     * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi]
     * represents the width and the height of an envelope.
     * One envelope can fit into another if and only if both the width and height of
     * one envelope is greater than the width and height of the other envelope.
     * <p>
     * Return the maximum number of envelopes can you Russian doll (i.e., put one inside the other).
     * Note: You cannot rotate an envelope.
     * <p>
     * Constraints:
     * 1 <= envelopes.length <= 5000
     * envelopes[i].length == 2
     * 1 <= wi, hi <= 10^4
     *
     * @param envelopes a 2D array of integers
     * @return the maximum number of envelopes can you Russian dol
     */
    // Runtime: 241 ms
    // Memory Usage: 39.9 MB
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 1) return 1;
        Arrays.sort(envelopes, (arr1, arr2) -> {
            if (arr1[0] == arr2[0])
                return arr1[1] - arr2[1];
            else
                return arr1[0] - arr2[0];
        });
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        int count = 0;
        for (int i = 0; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            count = Math.max(dp[i], count);
        }
        return count;
    }

}
