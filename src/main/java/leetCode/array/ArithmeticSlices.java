package leetCode.array;

/**
 * @author Anna S. Almielka
 */

public class ArithmeticSlices {

    /**
     * 413.Arithmetic Slices
     * <p>
     * A sequence of numbers is called arithmetic if it consists of at least three elements
     * and if the difference between any two consecutive elements is the same.
     * <p>
     * A zero-indexed array A consisting of N numbers is given.
     * A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
     * <p>
     * A slice (P, Q) of the array A is called arithmetic if the sequence:
     * A[P], A[P + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
     * <p>
     * The function should return the number of arithmetic slices in the array A.
     *
     * @param arr an array of integers
     * @return the number of arithmetic slices in the array {@code arr}
     */
    // Runtime: 0 ms
    // Memory Usage: 36.5 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int numberOfArithmeticSlices(int[] arr) {
        if (arr == null || arr.length < 3) return 0;
        int count = 0, result = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int tmp = arr[i + 1] - arr[i];
            count = (arr[i + 2] - arr[i + 1] == tmp) ? count + 1 : 0;
            result += count;
        }
        return result;

    }

}
