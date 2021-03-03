package leetCodingChallenge.year2021.march.week1;

/**
 * @author Anna S. Almielka
 * 03.03.2021
 */

public class Day03 {

    /**
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     * <p>
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
     * <p>
     * Constraints:
     * n == nums.length
     * 1 <= n <= 10<sup>4</sup>
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     *
     * @param nums an array of integers in the range [0, n]
     * @return a missing integer
     */
    // Runtime: 1 ms
    // Memory Usage: 39.2 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int missingNumber(int[] nums) {
        boolean[] checked = new boolean[nums.length + 1];
        for (int index : nums) {
            checked[index] = true;
        }
        for (int i = 0; i < checked.length; i++) {
            if (!checked[i]) return i;
        }
        return -1;
    }

}
