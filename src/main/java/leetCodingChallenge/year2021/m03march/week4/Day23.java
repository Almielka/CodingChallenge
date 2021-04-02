package leetCodingChallenge.year2021.m03march.week4;

/**
 * @author Anna S. Almielka
 * 23.03.2021
 */

public class Day23 {

    /**
     * Given an integer array arr, and an integer target, return the number of tuples i, j, k
     * such that i < j < k and arr[i] + arr[j] + arr[k] == target.
     * As the answer can be very large, return it modulo 10^9 + 7.
     * <p>
     * Constraints:
     * 3 <= arr.length <= 3000
     * 0 <= arr[i] <= 100
     * 0 <= target <= 300
     *
     * @param arr
     * @param target
     * @return
     */
    // Runtime: 108 ms
    // Memory Usage: 38.9 MB
    public int threeSumMulti(int[] arr, int target) {
        int[] numbers = new int[target + 1];
        int mod = (int) (Math.pow(10, 9) + 7);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                result = (result + numbers[target - arr[i]]) % mod;
                for (int j = 0; j < i; j++) {
                    if (arr[i] + arr[j] <= target) numbers[arr[i] + arr[j]]++;
                }
            }
        }
        return result;
    }

}
