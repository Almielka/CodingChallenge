package leetCodingChallenge.year2021.m05may.week3;

/**
 * @author Anna S. Almielka
 * 15.05.2021
 */

public class Day15 {

    /**
     * A valid number can be split up into these components (in order):
     * <p>
     * A decimal number or an integer.
     * (Optional) An 'e' or 'E', followed by an integer.
     * A decimal number can be split up into these components (in order):
     * <p>
     * (Optional) A sign character (either '+' or '-').
     * One of the following formats:
     * At least one digit, followed by a dot '.'.
     * At least one digit, followed by a dot '.', followed by at least one digit.
     * A dot '.', followed by at least one digit.
     * An integer can be split up into these components (in order):
     * <p>
     * (Optional) A sign character (either '+' or '-').
     * At least one digit.
     * For example, all the following are valid numbers:
     * ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7",
     * "+6e-1", "53.5e93", "-123.456e789"],
     * while the following are not valid numbers:
     * ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].
     * <p>
     * Given a string s, return true if s is a valid number.
     * <p>
     * Constraints:
     * 1 <= s.length <= 20
     * s consists of only English letters (both uppercase and lowercase),
     * digits (0-9), plus '+', minus '-', or dot '.'.
     *
     * @param s a string
     * @return {@code true} if s is a valid number, otherwise {@code false}
     */
    // Runtime: 2 ms
    // Memory Usage: 39.2 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public boolean isNumber(String s) {
        boolean number = false;
        boolean dot = false;
        boolean exp = false;
        boolean sign = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) number = true;
            else if (c == '.') {
                if (dot || exp) return false;
                else dot = true;
            } else if (c == 'e' || c == 'E') {
                if (exp || !number) return false;
                else {
                    exp = true;
                    dot = false;
                    number = false;
                    sign = false;
                }
            } else if (c == '+' || c == '-') {
                if (sign || number || dot) return false;
                else sign = true;
            } else return false;
        }
        return number;
    }

}
