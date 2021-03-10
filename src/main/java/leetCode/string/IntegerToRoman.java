package leetCode.string;

/**
 * @author Anna S. Almielka
 */

public class IntegerToRoman {
    /**
     * 12.Integer to Roman
     * <p>
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII,
     * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However,
     * the numeral for four is not IIII. Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX.
     * There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     * <p>
     * Constraints:
     * 1 <= num <= 3999
     *
     * @param num an integer
     * @return a string contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M')
     */
    // Runtime: 3 ms
    // Memory Usage: 37.9 MB
    private StringBuilder builder = new StringBuilder();

    public String intToRoman(int num) {
        if (num / 1000 > 0) {
            numberToRomanChar(num / 1000, 'M', 'V', '0');
            num %= 1000;
        }
        if (num / 100 > 0) {
            numberToRomanChar(num / 100, 'C', 'D', 'M');
            num %= 100;
        }
        if (num / 10 > 0) {
            numberToRomanChar(num / 10, 'X', 'L', 'C');
            num %= 10;
        }
        numberToRomanChar(num, 'I', 'V', 'X');
        return builder.toString();
    }

    public void numberToRomanChar(int number, char a, char b, char c) {
        switch (number) {
            case 1 -> builder.append(a);
            case 2 -> builder.append(a).append(a);
            case 3 -> builder.append(a).append(a).append(a);
            case 4 -> builder.append(a).append(b);
            case 5 -> builder.append(b);
            case 6 -> builder.append(b).append(a);
            case 7 -> builder.append(b).append(a).append(a);
            case 8 -> builder.append(b).append(a).append(a).append(a);
            case 9 -> builder.append(a).append(c);
        }
    }

}

