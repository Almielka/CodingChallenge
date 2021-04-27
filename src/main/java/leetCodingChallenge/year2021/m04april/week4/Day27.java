package leetCodingChallenge.year2021.m04april.week4;

/**
 * @author Anna S. Almielka
 * 27.04.2021
 */

public class Day27 {

    /**
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * An integer n is a power of three, if there exists an integer x such that n == 3^x.
     *
     * Constraints:
     * -2^31 <= n <= 2^31 - 1
     *
     * Follow up: Could you solve it without loops/recursion?
     *
     * @param n an integer
     * @return {@code true} if it is a power of three, otherwise {@code false}
     */
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }

}
