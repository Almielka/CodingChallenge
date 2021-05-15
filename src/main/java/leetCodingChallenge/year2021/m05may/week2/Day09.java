package leetCodingChallenge.year2021.m05may.week2;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 09.05.2021
 */

public class Day09 {

    /**
     * Given an array of integers target.
     * From a starting array, A consisting of all 1's, you may perform the following procedure :
     * let x be the sum of all elements currently in your array.
     * choose index i, such that 0 <= i < target.size and set the value of A at index i to x.
     * You may repeat this procedure as many times as needed.
     * Return True if it is possible to construct the target array from A otherwise return False.
     * <p>
     * Constraints:
     * N == target.length
     * 1 <= target.length <= 5 * 10^4
     * 1 <= target[i] <= 10^9
     *
     * @param target an array of integers
     * @return {@code true} if it is possible to construct the {@code target} array from,
     * otherwise {@code false}
     */
    // Runtime: 7 ms
    // Memory Usage: 46.5 MB
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public boolean isPossible(int[] target) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int n : target) {
            sum += n;
            pq.add(n);
        }
        while (pq.peek() != 1) {
            int n = pq.poll();
            sum -= n;
            if (n <= sum || sum < 1) return false;
            n %= sum;
            sum += n;
            pq.add(n);
        }
        return true;
    }

}
