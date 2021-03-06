package leetCode.array;

/**
 * @author Anna S. Almielka
 */

public class MissingNumber {

    /**
     * 268.Missing Number
     * <p>
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     * <p>
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
     * <p>
     * Constraints:
     * n == nums.length
     * 1 <= n <= 10^4
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     *
     * @param nums an array of integers in the range [0, n]
     * @return a missing integer
     */
    // Runtime: 1 ms
    // Memory Usage: 39.2 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
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

    // Runtime: 0 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    /**
     * Bit Manipulation
     */
    public int missingNumber2(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ (i + 1);
        }
        return xor;
    }

    // Runtime: 0 ms
    // Memory Usage: 39.2 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int missingNumber3(int[] nums) {
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            result += i - nums[i - 1];
        }
        return result;
    }

    // Runtime: 0 ms
    // Memory Usage: 39.2 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    /**
     * Gauss' Formula
     */
    public int missingNumber4(int[] nums) {
        int result = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return result - sum;
    }

}

