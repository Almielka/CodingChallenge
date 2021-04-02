package leetCodingChallenge.year2021.m02february.week4;

/**
 * @author Anna S. Almielka
 * 27.02.2021
 */

public class Day27 {

    /**
     * Given two integers dividend and divisor, divide two integers
     * without using multiplication, division, and mod operator.
     * <p>
     * Return the quotient after dividing dividend by divisor.
     * <p>
     * The integer division should truncate toward zero, which means losing its fractional part.
     * For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
     * <p>
     * Note:
     * Assume we are dealing with an environment that could only store integers
     * within the 32-bit signed integer range: [−2<sup>31</sup>,  2<sup>31</sup> − 1].
     * For this problem, assume that your function returns 2<sup>31</sup> − 1 when the division result overflows.
     * <p>
     * Constraints:
     * -2<sup>31</sup> <= dividend, divisor <= 2<sup>31</sup> - 1
     * divisor != 0
     *
     * @param dividend an integer
     * @param divisor  an integer
     * @return divide two integers without using multiplication, division, and mod operator
     */
    // Runtime: 2820 ms, need use Lsh Rsh
    // Memory Usage: 36.1 MB
    // Time complexity: O(n)
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend >= 0 && divisor < 0);
        long result = 0;
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        while ((absDividend - absDivisor) >= 0) {
            absDividend -= absDivisor;
            result++;
        }

        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

        return isNegative ? (int) ~result + 1 : (int) result;

    }

}
