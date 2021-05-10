package leetCodingChallenge.year2021.m05may.week2;

/**
 * @author Anna S. Almielka
 * 10.05.2021
 */

public class Day10 {

    /**
     * Count the number of prime numbers less than a non-negative number, n.
     * <p>
     * Constraints:
     * 0 <= n <= 5 * 10^6
     *
     * @param n an integer
     * @return the number of prime
     */

    /**
     * Sieve of Eratosthenes
     */
    // Runtime: 28 ms
    // Memory Usage: 42.1 MB
    // Time Complexity : O(n)?
    // Space Complexity: O(n)
    public int countPrimes(int n) {
        boolean[] noPrimes = new boolean[n];
        if (n < 3) return 0;
        for (int i = 2; i * i < n; i++) {
            if (!noPrimes[i]) {
                for (int j = i * i; j < n; j += i) {
                    noPrimes[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < noPrimes.length; i++) {
            if (!noPrimes[i]) count++;
        }
        return count;
    }

}
