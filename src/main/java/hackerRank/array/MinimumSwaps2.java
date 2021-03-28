package hackerRank.array;

/**
 * @author Anna S. Almielka
 */

public class MinimumSwaps2 {

    /**
     * You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n]
     * without any duplicates. You are allowed to swap any two elements.
     * Find the minimum number of swaps required to sort the array in ascending order.
     * <p>
     * Constraints:
     * 1 <= n <= 10^5
     * 1 <= arr[i] <= n
     *
     * @param arr an unordered array of integers
     * @return the minimum number of swaps to sort the array
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int minimumSwaps(int[] arr) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int tmp = arr[i];
                arr[i] = arr[tmp - 1];
                arr[tmp - 1] = tmp;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }

}
