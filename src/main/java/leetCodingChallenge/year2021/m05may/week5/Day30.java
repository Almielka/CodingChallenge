package leetCodingChallenge.year2021.m05may.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 30.05.2021
 */

public class Day30 {

    /**
     * Given an integer array nums, return the maximum difference
     * between two successive elements in its sorted form.
     * If the array contains less than two elements, return 0.
     * <p>
     * You must write an algorithm that runs in linear time and uses linear extra space.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 10^4
     * 0 <= nums[i] <= 10^9
     *
     * @param nums an integer array
     * @return the maximum difference between two successive elements in its sorted form
     */
    // Runtime: 2 ms
    // Memory Usage: 39.5 MB
    // Time Complexity: O(n * log(n))
    // Space Complexity: O(n)
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] - nums[i - 1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    /**
     * Bucket sort
     */
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int maximumGap2(int[] nums) {
        if (nums.length < 2) return 0;
        int high = 0;
        int low = Integer.MAX_VALUE;
        int max = 0;
        for (int n : nums) {
            high = Math.max(high, n);
            low = Math.min(low, n);
        }
        int bucketSize = Math.max((high - low) / (nums.length - 1), 1);
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = (high - low) / bucketSize; i >= 0; i--) {
            buckets.add(new ArrayList<>());
        }
        for (int n : nums) {
            buckets.get((n - low) / bucketSize).add(n);
        }
        int curHigh = 0;
        for (List<Integer> b : buckets) {
            if (b.isEmpty()) continue;
            int prevHigh = curHigh > 0 ? curHigh : b.get(0), curLow = b.get(0);
            for (int n : b) {
                curHigh = Math.max(curHigh, n);
                curLow = Math.min(curLow, n);
            }
            max = Math.max(max, curLow - prevHigh);
        }
        return max;
    }

}
