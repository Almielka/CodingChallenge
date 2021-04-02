package leetCodingChallenge.year2021.m02february.week4;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 25.02.2021
 */

public class Day25 {

    /**
     * Given an integer array nums, you need to find one continuous subarray
     * that if you only sort this subarray in ascending order,
     * then the whole array will be sorted in ascending order.
     * <p>
     * Return the shortest such subarray and output its length.
     *
     * @param nums an integer array
     * @return length of the shortest such subarray
     */
    // Runtime: 6 ms
    // Memory Usage: 40.9 MB
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        if (Arrays.equals(nums, sorted)) return 0;
        int[] tmp = {-1, -1};
        int i = 0;
        while (nums[i] == sorted[i]) {
            tmp[0] = i;
            i++;
        }
        int j = nums.length - 1;
        while (nums[j] == sorted[j]) {
            tmp[1] = j;
            j--;
        }
        if (tmp[0] == -1 && tmp[1] == -1) return nums.length;
        if (tmp[0] == -1) return tmp[1];
        if (tmp[1] == -1) return nums.length - 1 - tmp[0];
        return tmp[1] - 1 - tmp[0];
    }

}
