package leetCodingChallenge.year2021.march.week4;

/**
 * @author Anna S. Almielka
 * 28.03.2021
 */

public class Day28 {

    /**
     * Given a non-empty string containing an out-of-order English
     * representation of digits 0-9, output the digits in ascending order.
     * <p>
     * Note:
     * Input contains only lowercase English letters.
     * Input is guaranteed to be valid and can be transformed to its original digits.
     * That means invalid inputs such as "abc" or "zerone" are not permitted.
     * Input length is less than 50,000.
     *
     * @param s a non-empty string
     * @return the digits in ascending order
     */
    // Runtime: 4 ms
    // Memory Usage: 39 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static final int ALPHABET = 26;
    private static final int DIGITS = 10;

    public String originalDigits(String s) {
        int[] digits = new int[DIGITS];
        int[] map = new int[ALPHABET];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }

        digits[0] = map['z' - 'a']; // zero, z
        digits[2] = map['w' - 'a']; // two, w
        digits[4] = map['u' - 'a']; // four, u
        digits[6] = map['x' - 'a']; // six, x
        digits[8] = map['g' - 'a']; // eight, g
        digits[5] = map['f' - 'a'] - digits[4]; // five, f, 4
        digits[7] = map['s' - 'a'] - digits[6]; // seven, s, 6
        digits[3] = map['h' - 'a'] - digits[8]; // three, h, 8
        digits[1] = map['o' - 'a'] - digits[0] - digits[2] - digits[4]; // one, o, 0 2 4
        digits[9] = map['i' - 'a'] - digits[6] - digits[8] - digits[5]; // nine, i, 6 8 5


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < DIGITS; i++) {
            int freq = digits[i];
            while (freq > 0) {
                builder.append(i);
                freq--;
            }
        }
        return builder.toString();
    }

}
