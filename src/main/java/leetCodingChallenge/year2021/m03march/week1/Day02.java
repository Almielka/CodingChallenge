package leetCodingChallenge.year2021.m03march.week1;

/**
 * @author Anna S. Almielka
 * 02.03.2021
 */

public class Day02 {

    /**
     * You have a set of integers s, which originally contains all the numbers from 1 to n.
     * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
     * which results in repetition of one number and loss of another number.
     * <p>
     * You are given an integer array nums representing the data status of this set after the error.
     * <p>
     * Find the number that occurs twice and the number that is missing and return them in the form of an array.
     * <p>
     * Constraints:
     * 2 <= nums.length <= 10<sup>4</sup>
     * 1 <= nums[i] <= 10<sup>4</sup>
     *
     * @param nums an array of integers
     * @return an array of integers: twice and missing
     */
    // Runtime: 1 ms
    // Memory Usage: 40.3 MB
    // Time complexity: O(n)
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int[] checked = new int[nums.length + 1];
        for (int index : nums) {
            checked[index]++;
        }
        for (int i = 1; i < checked.length; i++) {
            if (checked[i] == 2) arr[0] = i;
            if (checked[i] == 0) arr[1] = i;
        }
        return arr;
    }

}
