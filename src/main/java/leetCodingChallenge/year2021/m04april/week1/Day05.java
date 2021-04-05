package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 05.04.2021
 */

public class Day05 {

    /**
     * We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
     * The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
     * The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
     * Return true if and only if the number of global inversions is equal to the number of local inversions.
     * Note:
     * A will be a permutation of [0, 1, ..., A.length - 1].
     * A will have length in range [1, 5000].
     * The time limit for this problem has been reduced.
     *
     * @param A an array of integers will be a permutation of [0, 1, ..., A.length - 1]
     * @return {@code true} if the number of global inversions is equal to the number of local inversions
     */
    // Runtime: 1 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(i - A[i]) > 1) return false;
        }
        return true;
    }

}
