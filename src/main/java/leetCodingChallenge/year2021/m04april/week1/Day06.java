package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 06.04.2021
 */

public class Day06 {

    /**
     * You have an array arr of length n where arr[i] = (2 * i) + 1 for all valid values of i (i.e. 0 <= i < n).
     * <p>
     * In one operation, you can select two indices x and y where 0 <= x, y < n
     * and subtract 1 from arr[x] and add 1 to arr[y] (i.e. perform arr[x] -=1 and arr[y] += 1).
     * The goal is to make all the elements of the array equal.
     * It is guaranteed that all the elements of the array can be made equal using some operations.
     * <p>
     * Constraints:
     * 1 <= n <= 10^4
     *
     * @param n an integer, the length of the array
     * @return the minimum number of operations needed to make all the elements of arr equal
     */
    // Runtime: 0 ms
    // Memory Usage: 35.6 MB
    // Time Complexity: O(n/2)
    // Space Complexity: O(1)
    public int minOperations(int n) {
        int count = 0;
        n--;
        while (n > 0) {
            count += n;
            n -= 2;
        }
        return count;

    }

    // Runtime: 0 ms
    // Memory Usage: 35.8 MB
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int minOperations2(int n) {
        if (n % 2 == 0) {
            n /= 2;
            return n * n;
        } else {
            n /= 2;
            return n * (n + 1);
        }
    }

    // Runtime: 0 ms
    // Memory Usage: 35.6 MB
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int minOperations3(int n) {
        return n * n / 4;
    }

}
