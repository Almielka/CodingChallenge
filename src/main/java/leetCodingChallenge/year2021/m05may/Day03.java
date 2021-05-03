package leetCodingChallenge.year2021.m05may;

/**
 * @author Anna S. Almielka
 * 03.05.2021
 */

public class Day03 {

    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * Return the running sum of nums.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     *
     * @param nums an array of integers
     * @return the running sum of nums
     */
    // Runtime: 0 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

}
