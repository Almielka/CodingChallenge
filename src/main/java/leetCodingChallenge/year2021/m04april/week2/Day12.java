package leetCodingChallenge.year2021.m04april.week2;

public class Day12 {

    /**
     * Given two integers n and k, you need to construct a list which contains n
     * different positive integers ranging from 1 to n and obeys the following requirement:
     * Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|,
     * |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
     * If there are multiple answers, print any of them.
     * <p>
     * Note:
     * The n and k are in the range 1 <= k < n <= 10^4.
     *
     * @param n an integer, will contains in array[n]
     * @param k an integer
     * @return arrays of integers
     */
    // Runtime: 1 ms
    // Memory Usage: 39.2 MB
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int left = 1;
        int right = n;
        for (int i = 0; i < n; i++) {
            arr[i] = (k % 2 != 0) ? left++ : right--;
            if (k > 1) k--;
        }
        return arr;
    }

}
