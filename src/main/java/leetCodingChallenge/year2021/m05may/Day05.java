package leetCodingChallenge.year2021.m05may;

/**
 * @author Anna S. Almielka
 * 05.05.2021
 */

public class Day05 {

    /**
     * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
     * Each element in the array represents your maximum jump length at that position.
     * Your goal is to reach the last index in the minimum number of jumps.
     * You can assume that you can always reach the last index.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 1000
     * 0 <= nums[i] <= 10^5
     *
     * @param nums an array of non-negative integers
     * @return the minimum number of jumps to reach the last index
     */
    // Runtime: 0 ms
    // Memory Usage: 36.3 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int jump = 0;
        int sum = 0;
        int next = 0;
        for (int i = 0; i < n; i++) {
            sum = Math.max(sum, nums[i] + i);
            if (i == next) {
                jump++;
                next = sum;
            }
        }
        return jump;
    }

}
