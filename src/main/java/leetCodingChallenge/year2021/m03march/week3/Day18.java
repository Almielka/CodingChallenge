package leetCodingChallenge.year2021.m03march.week3;

/**
 * @author Anna S. Almielka
 * 18.03.2021
 */

public class Day18 {

    /**
     * Given an integer array nums, return the length of the longest wiggle sequence.
     * <p>
     * A wiggle sequence is a sequence where the differences between successive
     * numbers strictly alternate between positive and negative.
     * The first difference (if one exists) may be either positive or negative.
     * A sequence with fewer than two elements is trivially a wiggle sequence.
     * <p>
     * For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because
     * the differences (6, -3, 5, -7, 3) are alternately positive and negative.
     * In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences,
     * the first because its first two differences are positive and the second because its last difference is zero.
     * A subsequence is obtained by deleting some elements (eventually, also zero)
     * from the original sequence, leaving the remaining elements in their original order.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 1000
     * 0 <= nums[i] <= 1000
     *
     * @param nums an array of integers
     * @return the length of the longest wiggle sequence
     */
    // Runtime: 0 ms
    // Memory Usage: 36.4 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int wiggleMaxLength(int[] nums) {
        int left = 1;
        int right = 1;
        if (nums.length == 1) return 1;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff > 0) {
                left = right + 1;
            } else if (diff < 0) {
                right = left + 1;
            }
        }
        return Math.max(left, right);
    }

}
