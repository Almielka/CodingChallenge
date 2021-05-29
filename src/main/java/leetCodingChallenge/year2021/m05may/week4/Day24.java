package leetCodingChallenge.year2021.m05may.week4;

/**
 * @author Anna S. Almielka
 * 24.05.2021
 */

public class Day24 {

    /**
     * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
     * Constraints:
     * 1 <= s.length <= 100
     * s consists of printable ASCII characters.
     *
     * @param s a string
     * @return the string after replacing every uppercase letter with the same lowercase letter
     */
    // Runtime: 0 ms
    // Memory Usage: 36.7 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 64 && c < 91)
                s = s.replace(c, (char) (c + 32));
        }
        return s;
    }

}
