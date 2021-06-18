package leetCode.array;

/**
 * @author Anna S. Almielka
 */

public class CoinChange2 {

    /**
     * 518. Coin Change 2
     * <p>
     * You are given an integer array coins representing coins of different denominations,
     * and an integer amount representing a total amount of money.
     * Return the number of combinations that make up that amount.
     * If that amount of money cannot be made up by any combination of the coins, return 0.
     * You may assume that you have an infinite number of each kind of coin.
     * The answer is guaranteed to fit into a signed 32-bit integer.
     * <p>
     * Constraints:
     * 1 <= coins.length <= 300
     * 1 <= coins[i] <= 5000
     * All the values of coins are unique.
     * 0 <= amount <= 5000
     *
     * @param amount an integer representing a total amount of money
     * @param coins  an array of integers
     * @return he number of combinations that make up that {@code amount}
     */
    // Runtime: 2 ms
    // Memory Usage: 36.3 MB
    // Time Complexity: O(n * m) where n = coins.length, m = amount
    // Space Complexity: O(m)
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i < amount + 1; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }

}
