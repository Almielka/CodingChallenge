package leetCode.binary;

/**
 * @author Anna S. Almielka
 */

public class NumberOf1Bits {

    /**
     * 191.Number of 1 Bits
     *
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
