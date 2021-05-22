package leetCodingChallenge.year2021.m05may.week3;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 19.05.2021
 */

public class Day19 {

    /**
     * Given an integer array nums of size n,
     * return the minimum number of moves required to make all array elements equal.
     * In one move, you can increment or decrement an element of the array by 1.
     * <p>
     * Constraints:
     * n == nums.length
     * 1 <= nums.length <= 10^5
     * -109 <= nums[i] <= 10^9
     *
     * @param nums an array of integers
     * @return the minimum number of moves red to make all array {@code nums} elements equal
     */
    // Runtime: 2 ms
    // Memory Usage: 39.5 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int minMoves2(int[] nums) {
        int move = 0;
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        for (int num : nums) {
            move += Math.abs(median - num);
        }
        return move;
    }

}
