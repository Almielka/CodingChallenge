package leetCodingChallenge.year2021.m05may.week2;

/**
 * @author Anna S. Almielka
 * 08.05.2021
 */

public class Day08 {

    /**
     * Let's say a positive integer is a super-palindrome if it is a palindrome,
     * and it is also the square of a palindrome.
     * Given two positive integers left and right represented as strings,
     * return the number of super-palindromes integers in the inclusive range [left, right].
     * <p>
     * Constraints:
     * 1 <= left.length, right.length <= 18
     * left and right consist of only digits.
     * left and right cannot have leading zeros.
     * left and right represent integers in the range [1, 10^18].
     * left is less than or equal to right
     *
     * @param left  the positive integer represented as string
     * @param right the positive integer represented as string
     * @return the number of super-palindromes integers in the inclusive range [left, right]
     */
    // Runtime: 937 ms
    // Memory Usage: 230.2 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int superPalindromesInRange(String left, String right) {
        int count = 0;
        if (Long.parseLong(left) < 10 && Long.parseLong(right) > 10) {
            count++;
        }
        for (int i = 1; i < 100000; i++) {
            String num = Integer.toString(i, 3);
            if (isPalindrome(num)) {
                long square = Long.parseLong(num) * Long.parseLong(num);
                if (square >= Long.parseLong(left) && square <= Long.parseLong(right) && isPalindrome(Long.toString(square))) {
                    count++;
                }
            }

        }
        return count;
    }

    private boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }

}
