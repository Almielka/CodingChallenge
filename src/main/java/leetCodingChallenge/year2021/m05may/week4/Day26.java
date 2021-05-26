package leetCodingChallenge.year2021.m05may.week4;

/**
 * @author Anna S. Almielka
 * 26.05.2021
 */

public class Day26 {

    /**
     * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
     * For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
     * Given a string n that represents a positive decimal integer,
     * return the minimum number of positive deci-binary numbers needed so that they sum up to n.
     * <p>
     * Constraints:
     * 1 <= n.length <= 10^5
     * n consists of only digits.
     * n does not contain any leading zeros and represents a positive integer.
     *
     * @param n a string represents a number
     * @return the minimum number of positive deci-binary numbers needed so that they sum up to {@code n}
     */
    // Runtime: 4 ms
    // Memory Usage: 39.3 MB
    // Time Complexity : O(n) where n = length of string
    // Space Complexity: O(1)
    public int minPartitions(String n) {
        char count = '0';
        for (char c : n.toCharArray()) {
            if (c > count) {
                count = c;
            }
        }
        return count - '0';
    }

}
