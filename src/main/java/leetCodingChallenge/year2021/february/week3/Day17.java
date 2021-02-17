package leetCodingChallenge.year2021.february.week3;

/**
 * @author Anna S. Almielka
 * 17.02.2021
 */

public class Day17 {

    /**
     * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
     * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
     * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
     *
     * @param height an array of non-negative integers
     * @return max area, contains the most water
     */
    // Runtime: 2 ms
    // Memory Usage: 40.9 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int value = (right - left) * Math.min(height[right], height[left]);
            max = Math.max(max, value);
            if (height[right] > height[left]) left++;
            else right--;
        }
        return max;
    }

    // Runtime: 729 ms
    // Memory Usage: 40.2 MB
    // Time complexity: O(n^2)
    // Space complexity: O(1)
//    public int maxArea(int[] height) {
//        int max = 0, tmpY = 0;
//        for (int i = height.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                int x = i - j;
//                int y = Math.min(height[i], height[j]);
//                if (y > tmpY && x * y > max) {
//                    max = x * y;
//                    tmpY = y;
//                }
//            }
//        }
//        return max;
//    }

}
