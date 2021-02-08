package leetCode.easyAlgorithms.array;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class LongestHarmoniousSubsequence {

    /**
     * 594.Longest Harmonious Subsequence
     *
     * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
     * Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
     * A subsequence of array is a sequence that can be derived from the array by deleting some
     * or no elements without changing the order of the remaining elements.
     *
     * @param nums an integer array
     * @return the length of its longest harmonious subsequence
     */
    //Time complexity : O(n)
    //Space complexity : O(n)
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        int result = 0;
        for (int i = 1; i < nums.length; ) {
            if (nums[i] - nums[min] == 0)
                i++;
            else if (nums[i] - nums[min] == 1) {
                result = Math.max(result, i - min + 1);
                i++;
            } else
                min++;
        }
        return result;
    }

}
