package leetCodingChallenge.year2021.m05may.week4;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 23.05.2021
 */

public class Day23 {

    /**
     * Given an array of strings words, return the smallest string that contains
     * each string in words as a substring.
     * If there are multiple valid strings of the smallest length, return any of them.
     * You may assume that no string in words is a substring of another string in words.
     * <p>
     * Constraints:
     * 1 <= words.length <= 12
     * 1 <= words[i].length <= 20
     * words[i] consists of lowercase English letters.
     * All the strings of words are unique.
     *
     * @param words an array of strings
     * @return the smallest string that contains each string in {@code words} as a substring
     */
    // Runtime: 45 ms
    // Memory Usage: 38.5 MB
    // Time Complexity: O(N^2 (2^N + W)), where NN is the number of words, and WW is the maximum length of each word.
    // Space Complexity: O(N (2^N + W))
    public String shortestSuperString(String[] words) {
        int N = words.length;

        // Populate overlaps
        int[][] overlaps = new int[N][N];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                if (i != j) {
                    int m = Math.min(words[i].length(), words[j].length());
                    for (int k = m; k >= 0; --k)
                        if (words[i].endsWith(words[j].substring(0, k))) {
                            overlaps[i][j] = k;
                            break;
                        }
                }

        // dp[mask][i] = most overlap with mask, ending with ith element
        int[][] dp = new int[1 << N][N];
        int[][] parent = new int[1 << N][N];
        for (int mask = 0; mask < (1 << N); ++mask) {
            Arrays.fill(parent[mask], -1);

            for (int bit = 0; bit < N; ++bit)
                if (((mask >> bit) & 1) > 0) {
                    // Let's try to find dp[mask][bit].  Previously, we had
                    // a collection of items represented by pmask.
                    int pmask = mask ^ (1 << bit);
                    if (pmask == 0) continue;
                    for (int i = 0; i < N; ++i)
                        if (((pmask >> i) & 1) > 0) {
                            // For each bit i in pmask, calculate the value
                            // if we ended with word i, then added word 'bit'.
                            int val = dp[pmask][i] + overlaps[i][bit];
                            if (val > dp[mask][bit]) {
                                dp[mask][bit] = val;
                                parent[mask][bit] = i;
                            }
                        }
                }
        }

        // # Answer will have length sum(len(words[i]) for i) - max(dp[-1])
        // Reconstruct answer, first as a sequence 'perm' representing
        // the indices of each word from left to right.

        int[] perm = new int[N];
        boolean[] seen = new boolean[N];
        int t = 0;
        int mask = (1 << N) - 1;

        // p: the last element of perm (last word written left to right)
        int p = 0;
        for (int j = 0; j < N; ++j)
            if (dp[(1 << N) - 1][j] > dp[(1 << N) - 1][p])
                p = j;

        // Follow parents down backwards path that retains maximum overlap
        while (p != -1) {
            perm[t++] = p;
            seen[p] = true;
            int p2 = parent[mask][p];
            mask ^= 1 << p;
            p = p2;
        }

        // Reverse perm
        for (int i = 0; i < t / 2; ++i) {
            int v = perm[i];
            perm[i] = perm[t - 1 - i];
            perm[t - 1 - i] = v;
        }

        // Fill in remaining words not yet added
        for (int i = 0; i < N; ++i)
            if (!seen[i])
                perm[t++] = i;

        // Reconstruct final answer given perm
        StringBuilder ans = new StringBuilder(words[perm[0]]);
        for (int i = 1; i < N; ++i) {
            int overlap = overlaps[perm[i - 1]][perm[i]];
            ans.append(words[perm[i]].substring(overlap));
        }

        return ans.toString();
    }

}



