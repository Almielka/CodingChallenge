package leetCodingChallenge.year2021.march.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 13.03.2021
 */

public class Day13 {

    /**
     * Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
     * We make a binary tree using these integers, and each number may be used for any number of times.
     * Each non-leaf node's value should be equal to the product of the values of its children.
     * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 10^9 + 7.
     * <p>
     * Constraints:
     * 1 <= arr.length <= 1000
     * 2 <= arr[i] <= 10^9
     *
     * @param arr an array of unique integers
     * @return the integer number of binary trees we can make
     */
    // Runtime: 36 ms
    // Memory Usage: 39.1 MB
    // Time complexity: O(n2)
    public int numFactoredBinaryTrees(int[] arr) {
        if (arr.length == 1) return 1;
        Arrays.sort(arr);
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            long value = 1L;
            for (int j = 0; j < i; j++) {
                int key = arr[i] / arr[j];
                if (arr[i] % arr[j] == 0 && map.containsKey(key)) {
                    value += map.get(key) * map.get(arr[j]);
                }
            }
            map.put(arr[i], value);
        }
        long sum = map.values().stream().mapToLong(Long::longValue).sum();
        return (int) (sum % (Math.pow(10, 9) + 7));
    }

}
