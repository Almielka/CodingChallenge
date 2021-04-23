package leetCodingChallenge.year2021.m04april.week4;

/**
 * @author Anna S. Almielka
 * 23.04.2021
 */

public class Day23 {

    /**
     * Give a string s, count the number of non-empty (contiguous) substrings that have
     * the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
     * Substrings that occur multiple times are counted the number of times they occur.
     * <p>
     * Note:
     * s.length will be between 1 and 50,000.
     * s will only consist of "0" or "1" characters.
     *
     * @param s a string
     * @return count binary substrings
     */
    // Runtime: 9 ms
    // Memory Usage: 39.8 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int countBinarySubstrings(String s) {
        int count = 0;
        int duplicates = 1;
        int prev = 0;
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) == s.charAt(i + 1)) duplicates++;
            else {
                count += Math.min(prev, duplicates);
                prev = duplicates;
                duplicates = 1;
            }
        return count + Math.min(prev, duplicates);
    }

}
