package leetCode.array;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class CoinChange {

    /**
     * 322.Coin Change
     * <p>
     * You are given coins of different denominations and a total amount of money amount.
     * Write a function to compute the fewest number of coins that you need to make up that amount.
     * If that amount of money cannot be made up by any combination of the coins, return -1.
     * You may assume that you have an infinite number of each kind of coin.
     * <p>
     * Constraints:
     * 1 <= coins.length <= 12
     * 1 <= coins[i] <= 2^31 - 1
     * 0 <= amount <= 10^4
     */
    // Runtime: 9 ms
    // Memory Usage: 38.3 MB
    // Time Complexity: O(n * m) where n = coins.length, m = amount
    // Space Complexity: O(m)
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i < amount + 1; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}
