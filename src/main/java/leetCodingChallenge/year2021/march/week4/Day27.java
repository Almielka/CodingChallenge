package leetCodingChallenge.year2021.march.week4;

/**
 * @author Anna S. Almielka
 * 27.03.2021
 */

public class Day27 {

    /**
     * Given a string, your task is to count how many palindromic substrings in this string.
     * The substrings with different start indexes or end indexes are counted
     * as different substrings even they consist of same characters.
     * Note:
     * The input string length won't exceed 1000.
     *
     * @param s a string
     * @return the number of palindromic substrings
     */
    // Runtime: 3 ms
    // Memory Usage: 37.4 MB
    // Time Complexity: O(n2)
    // Space Complexity: O(1)
    public int countSubstrings(String s) {
        if (s.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            count += countSubstrings(s, i, i) + countSubstrings(s, i, i + 1);
        return count;
    }

    private int countSubstrings(String s, int start, int end) {
        int count = 0;
        while (start >= 0 && end < s.length() && s.charAt(start--) == s.charAt(end++))
            count++;
        return count;
    }

}
