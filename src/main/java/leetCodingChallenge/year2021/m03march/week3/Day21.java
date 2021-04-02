package leetCodingChallenge.year2021.m03march.week3;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 21.03.2021
 */

public class Day21 {

    /**
     * Starting with a positive integer N, we reorder the digits in any order
     * (including the original order) such that the leading digit is not zero.
     * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
     * Note:
     * 1 <= N <= 10^9
     *
     * @param N a positive integer
     * @return true if and only if we can do this in a way such that the resulting number is a power of 2
     */
    // Runtime: 1 ms
    // Memory Usage: 36.1 MB
    public boolean reorderedPowerOf2(int N) {
        int[] digits = countDigits(N);
        for (int i = 0; i < 30; ++i)
            // (1 << i) power of 2 from 0 to 29 bit (2^30 > 10^9)
            if (Arrays.equals(digits, countDigits(1 << i))) {
                return true;
            }
        return false;
    }

    public int[] countDigits(int N) {
        int[] digits = new int[10];
        while (N > 0) {
            digits[N % 10]++;
            N /= 10;
        }
        return digits;
    }

}
