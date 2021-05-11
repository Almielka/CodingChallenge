package leetCodingChallenge.year2021.m05may.week2;

/**
 * @author Anna S. Almielka
 * 11.05.2021
 */

public class Day11 {

    /**
     * There are several cards arranged in a row, and each card has an associated number of points.
     * The points are given in the integer array cardPoints.
     * In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
     * Your score is the sum of the points of the cards you have taken.
     * Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
     * <p>
     * Constraints:
     * 1 <= cardPoints.length <= 10^5
     * 1 <= cardPoints[i] <= 10^4
     * 1 <= k <= cardPoints.length
     *
     * @param cardPoints an array of cards
     * @param k          a number of cards for taking
     * @return the maximum score of took cards
     */
    // Runtime: 3 ms
    // Memory Usage: 62 MB
    // Time Complexity : O(k)
    // Space Complexity: O(1)
    public int maxScore(int[] cardPoints, int k) {
        int length = cardPoints.length;
        int score = 0;
        for (int i = 0; i < k; i++) {
            score += cardPoints[i];
        }
        if (k == length) return score;
        int max = score;
        for (int i = k - 1, j = length - 1; i >= 0; i--, j--) {
            score += cardPoints[j] - cardPoints[i];
            max = Math.max(max, score);
        }
        return max;
    }
}
