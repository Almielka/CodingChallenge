package leetCodingChallenge.year2021.february.week1;

/**
 * @author Anna S. Almielka
 * 01.02.2021
 */

public class Day01 {

    /**
     * Write a function that takes an unsigned integer and
     * returns the number of '1' bits it has (also known as the Hamming weight).
     *
     * @param n an unsigned integer
     * @return the number of '1' bits it has
     */
    // you need to treat n as an unsigned value
    // Runtime: 1 ms
    // Memory Usage: 36 MB
    public int hammingWeight(int n) {

        if (n == 0) return 0;
        int result = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == 49) result++;
        }
        return result;

    }

}