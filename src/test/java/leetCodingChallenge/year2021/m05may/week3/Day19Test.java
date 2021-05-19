package leetCodingChallenge.year2021.m05may.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day19Test {

    private Day19 day;

    @BeforeEach
    void setUp() {
        day = new Day19();
    }

    @Test
    void testMinMoves() {
        // Input: nums = [1,2,3]
        // Output: 2
        // Explanation:
        // Only two moves are needed (remember each move increments or decrements one element):
        // [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
        int[] nums = {1, 2, 3};
        assertThat(day.minMoves2(nums), is(equalTo(2)));
    }

    @Test
    void testMinMoves2() {
        int[] nums = {1, 10, 2, 9};
        assertThat(day.minMoves2(nums), is(equalTo(16)));
    }

}
