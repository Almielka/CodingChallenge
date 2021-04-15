package leetCodingChallenge.year2021.m04april.week3;

public class Day15 {

    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     * <p>
     * Constraints:
     * 0 <= n <= 30
     *
     * @param n an integer number
     * @return the Fibonacci number F(n)
     */
    // Runtime: 6 ms
    // Memory Usage: 35.6 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Runtime: 6 ms
    // Memory Usage: 35.6 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int fib2(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int result = 0;
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 3; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

}
