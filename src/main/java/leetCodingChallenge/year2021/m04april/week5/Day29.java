package leetCodingChallenge.year2021.m04april.week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anna S. Almielka
 * 29.04.2021
 */

public class Day29 {

    /**
     * Given an array of integers nums sorted in ascending order,
     * find the starting and ending position of a given target value.
     * If target is not found in the array, return [-1, -1].
     * <p>
     * Constraints:
     * 0 <= nums.length <= 10^5
     * -10^9 <= nums[i] <= 10^9
     * nums is a non-decreasing array.
     * -10^9 <= target <= 10^9
     * <p>
     * Follow up: Could you write an algorithm with O(log n) runtime complexity?
     *
     * @param nums   array of integers
     * @param target an integer
     * @return the starting and ending position of a given {@code target} value
     */
    // Runtime: 4 ms
    // Memory Usage: 42.2 MB
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        result[0] = list.indexOf(target);
        result[1] = list.lastIndexOf(target);
        return result;
    }

}
