package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class CoinChangeTest {

    private CoinChange day;

    @BeforeEach
    void setUp() {
        day = new CoinChange();
    }

    @Test
    void testCoinChange() {
        // Input: coins = [1,2,5], amount = 11
        // Output: 3
        // Explanation: 11 = 5 + 5 + 1
        int[] coins = {1, 2, 5};
        assertThat(day.coinChange(coins, 11), is(equalTo(3)));
    }

    @Test
    void testCoinChange2() {
        int[] coins = {2};
        assertThat(day.coinChange(coins, 3), is(equalTo(-1)));
    }

    @Test
    void testCoinChange3() {
        int[] coins = {1};
        assertThat(day.coinChange(coins, 0), is(equalTo(0)));
    }

    @Test
    void testCoinChange4() {
        int[] coins = {1};
        assertThat(day.coinChange(coins, 1), is(equalTo(1)));
    }

    @Test
    void testCoinChange5() {
        int[] coins = {1};
        assertThat(day.coinChange(coins, 2), is(equalTo(2)));
    }

    @Test
    void testCoinChange6() {
        int[] coins = {186, 419, 83, 408};
        assertThat(day.coinChange(coins, 6249), is(equalTo(20)));
    }

}