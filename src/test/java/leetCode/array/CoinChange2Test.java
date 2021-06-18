package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class CoinChange2Test {

    private CoinChange2 day;

    @BeforeEach
    void setUp() {
        day = new CoinChange2();
    }

    @Test
    void testCoinChange() {
        // Explanation: there are four ways to make up the amount:
        // 5=5
        // 5=2+2+1
        // 5=2+1+1+1
        // 5=1+1+1+1+1
        int[] coins = {1, 2, 5};
        assertThat(day.change(5, coins), is(equalTo(4)));
    }

    @Test
    void testCoinChange2() {
        int[] coins = {2};
        assertThat(day.change(3, coins), is(equalTo(0)));
    }

    @Test
    void testCoinChange3() {
        int[] coins = {10};
        assertThat(day.change(10, coins), is(equalTo(1)));
    }

}