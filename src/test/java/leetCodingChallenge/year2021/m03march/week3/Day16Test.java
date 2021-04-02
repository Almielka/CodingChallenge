package leetCodingChallenge.year2021.m03march.week3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day16Test {

    private Day16 day;

    @BeforeEach
    void setUp() {
        day = new Day16();
    }

    @Test
    void testMaxProfit() {
        // Input: prices = [1,3,2,8,4,9], fee = 2
        // Output: 8
        // Explanation: The maximum profit can be achieved by:
        // - Buying at prices[0] = 1
        // - Selling at prices[3] = 8
        // - Buying at prices[4] = 4
        // - Selling at prices[5] = 9
        // The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
        int[] prices = {1, 3, 2, 8, 4, 9};
        assertThat(day.maxProfit(prices, 2), is(equalTo(8)));
    }

    @Test
    void testMaxProfit2() {
        // Input: prices = [1,3,7,5,10,3], fee = 3
        // Output: 6
        int[] prices = {1, 3, 7, 5, 10, 3};
        assertThat(day.maxProfit(prices, 3), is(equalTo(6)));
    }

}