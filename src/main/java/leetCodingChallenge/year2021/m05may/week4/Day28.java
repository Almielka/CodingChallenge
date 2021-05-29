package leetCodingChallenge.year2021.m05may.week4;

/**
 * @author Anna S. Almielka
 * 28.05.2021
 */

public class Day28 {

    /**
     * You are given an array of positive integers nums and want to erase a subarray containing unique elements.
     * The score you get by erasing the subarray is equal to the sum of its elements.
     * Return the maximum score you can get by erasing exactly one subarray.
     * <p>
     * An array b is called to be a subarray of a if it forms a contiguous subsequence of a,
     * that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
     * <p>
     * Constraints:
     * 1 <= nums.length <= 10^5
     * 1 <= nums[i] <= 10^4
     *
     * @param nums an array of positive integers
     * @return the maximum score cab get by erasing exactly one array
     */
    // Runtime: 6 ms
    // Memory Usage: 53.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(10001) for array keeping track of numbers from 0 to 10^4
    public int maximumUniqueSubarray(int[] nums) {
        int[] arr = new int[10001];
        int score = 0;
        int max = 0;
        for (int left = 0, right = 0; right < nums.length; right++) {
            arr[nums[right]]++;
            score += nums[right];
            while (arr[nums[right]] > 1) {
                arr[nums[left]]--;
                score -= nums[left++];
            }
            max = Math.max(max, score);
        }
        return max;
    }

}
