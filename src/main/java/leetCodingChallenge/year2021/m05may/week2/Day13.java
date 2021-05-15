package leetCodingChallenge.year2021.m05may.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 13.05.2021
 */

public class Day13 {

    /**
     * We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)".
     * Then, we removed all commas, decimal points, and spaces, and ended up with the string s.
     * Return a list of strings representing all possibilities for what our original coordinates could have been.
     * <p>
     * Our original representation never had extraneous zeroes, so we never started
     * with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other number
     * that can be represented with less digits.  Also, a decimal point within a number never occurs
     * without at least one digit occuring before it, so we never started with numbers like ".1".
     * <p>
     * The final answer list can be returned in any order.  Also note that all coordinates
     * in the final answer have exactly one space between them (occurring after the comma.)
     * <p>
     * Note:
     * 4 <= s.length <= 12.
     * s[0] = "(", s[s.length - 1] = ")", and the other elements in s are digits.
     *
     * @param s a string represents coordinates
     * @return a list of strings representing all possibilities coordinates
     */
    // Runtime: 10 ms
    // Memory Usage: 40.2 MB
    // Time Complexity : O(n2)
    public List<String> ambiguousCoordinates(String s) {
        List<String> answer = new ArrayList<>();
        for (int i = 2; i < s.length() - 1; i++) {
            String sX = s.substring(1, i);
            String sY = s.substring(i, s.length() - 1);
            List<String> coordinatesX = new ArrayList<>();
            for (int j = 0; j < sX.length(); j++)
                if (isValid(sX, j)) {
                    coordinatesX.add(sX.substring(0, j) + (j > 0 ? "." : "") + sX.substring(j));
                }
            for (int j = 0; j < sY.length(); j++)
                if (isValid(sY, j)) {
                    String y = sY.substring(0, j) + (j > 0 ? "." : "") + sY.substring(j);
                    for (String x : coordinatesX)
                        answer.add("(" + x + ", " + y + ")");
                }
        }
        return answer;
    }

    public boolean isValid(String str, int dec) {
        if (dec != 0 && str.charAt(str.length() - 1) == '0') return false;
        return str.length() == 1 || dec == 1 || str.charAt(0) != '0';
    }
}
