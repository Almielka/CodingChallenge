package leetCodingChallenge.year2021.m05may;

/**
 * @author Anna S. Almielka
 * 04.05.2021
 */

public class Day04 {

    /**
     * Given an array nums with n integers, your task is to check
     * if it could become non-decreasing by modifying at most one element.
     * We define an array is non-decreasing if nums[i] <= nums[i + 1]
     * holds for every i (0-based) such that (0 <= i <= n - 2).
     * <p>
     * Constraints:
     * n == nums.length
     * 1 <= n <= 10^4
     * -10^5 <= nums[i] <= 10^5
     *
     * @param nums an array of integers
     * @return {@code true} if {@code nums} could become non-decreasing by modifying at most one element,
     * otherwise {@code false}
     */
    // Runtime: 0 ms
    // Memory Usage: 40.5 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) return true;
        int step = 0;
        for (int i = 1; i < nums.length && step < 2; i++) {
            if (nums[i] >= nums[i - 1]) continue;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
            step++;
        }
        return step < 2;
    }

}
