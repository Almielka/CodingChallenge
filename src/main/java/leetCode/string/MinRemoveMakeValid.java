package leetCode.string;

/**
 * @author Anna S. Almielka
 */

public class MinRemoveMakeValid {
    /**
     * 1249.Minimum Remove to Make Valid Parentheses
     *
     * Given a string s of '(' , ')' and lowercase English characters.
     * <p>
     * Your task is to remove the minimum number of parentheses ( '(' or ')',
     * in any positions ) so that the resulting parentheses string is valid and return any valid string.
     * <p>
     * Formally, a parentheses string is valid if and only if:
     * <p>
     * It is the empty string, contains only lowercase characters, or
     * It can be written as AB (A concatenated with B), where A and B are valid strings, or
     * It can be written as (A), where A is a valid string.
     */
    // Runtime: 7 ms
    // Memory Usage: 39.3 MB
    public String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int bracket = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                bracket++;
            } else if (chars[i] == ')') {
                if (bracket == 0) {
                    chars[i] = '0';
                } else {
                    bracket--;
                }
            }
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (bracket > 0 && chars[i] == '(') {
                chars[i] = '0';
                bracket--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != '0')
                result.append(c);
        }
        return String.valueOf(result);

    }

}
