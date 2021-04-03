package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 03.04.2021
 */

public class Day03 {

    /**
     * Given a string containing just the characters '(' and ')',
     * find the length of the longest valid (well-formed) parentheses substring.
     * <p>
     * Constraints:
     * 0 <= s.length <= 3 * 10^4
     * s[i] is '(', or ')'
     *
     * @param s a string containing just the characters '(' and ')'
     * @return the length of the longest valid parentheses substring
     */
    // Runtime: 3 ms
    // Memory Usage: 39.4 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int longestValidParentheses(String s) {
        if (s.isEmpty()) return 0;
        int left = 0;
        int right = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                count = Math.max(count, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                count = Math.max(count, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return count;
    }

}
