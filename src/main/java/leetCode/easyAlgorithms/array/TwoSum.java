package leetCode.easyAlgorithms.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 11.01.2021
 */

public class TwoSum {

    /**
     * 01.Two Sum
     *
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     *
     * @param nums   an array of integers
     * @param target an integer
     * @return indices of the two numbers such that they add up to target
     */
    // Runtime: 0 ms
    // Memory Usage: 39.4 MB
    // Time complexity : O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tmpIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (tmpIndices.containsKey(tmp)) {
                return new int[]{tmpIndices.get(tmp), i};
            }
            tmpIndices.put(nums[i], i);
        }
        throw new IllegalArgumentException("There are no two numbers such that they add up to given target");
    }

}
