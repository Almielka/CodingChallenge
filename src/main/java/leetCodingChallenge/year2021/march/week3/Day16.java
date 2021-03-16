package leetCodingChallenge.year2021.march.week3;

/**
 * @author Anna S. Almielka
 * 16.03.2021
 */

public class Day16 {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day,
     * and an integer fee representing a transaction fee.
     * <p>
     * Find the maximum profit you can achieve. You may complete as many transactions as you like,
     * but you need to pay the transaction fee for each transaction.
     * <p>
     * Note: You may not engage in multiple transactions simultaneously
     * (i.e., you must sell the stock before you buy again).
     * <p>
     * Constraints:
     * 1 < prices.length <= 5 * 10^4
     * 0 < prices[i], fee < 5 * 10^4
     *
     * @param prices
     * @param fee
     * @return
     */
    // Runtime: 3 ms
    // Memory Usage: 48.1 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public int maxProfit(int[] prices, int fee) {
        int buying = 0;
        int selling = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            buying = Math.max(buying, prices[i] + selling - fee);
            selling = Math.max(selling, buying - prices[i]);
        }
        return buying;
    }
}
