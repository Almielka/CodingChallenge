package leetCodingChallenge.year2021.m04april.week3;

public class Day19 {

    /**
     * Given an array of distinct integers nums and a target integer target,
     * return the number of possible combinations that add up to target.
     * The answer is guaranteed to fit in a 32-bit integer.
     * Constraints:
     * <p>
     * 1 <= nums.length <= 200
     * 1 <= nums[i] <= 1000
     * All the elements of nums are unique.
     * 1 <= target <= 1000
     * <p>
     * Follow up: What if negative numbers are allowed in the given array?
     * How does it change the problem?
     * What limitation we need to add to the question to allow negative numbers?
     *
     * @param nums   an array of integers
     * @param target an integer
     * @return the number of possible combinations that add up to {@code target}
     */
    // Runtime: 1 ms
    // Memory Usage: 36.3 MB
    // Time Complexity: O(n * m) where n = nums.length, m = target
    // Space Complexity: O(m)
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < target; i++) {
            for (int num : nums) {
                if (i + num <= target) {
                    dp[i + num] += dp[i];
                }
            }
        }
        return dp[target];
    }

}
