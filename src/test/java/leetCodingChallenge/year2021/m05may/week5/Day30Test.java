package leetCodingChallenge.year2021.m05may.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day30Test {

    private Day30 day;

    @BeforeEach
    void setUp() {
        day = new Day30();
    }

    @Test
    void testMaximumGaps() {
        // Input: nums = [3,6,9,1]
        // Output: 3
        // Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
        int[] nums = {3, 6, 9, 1};
        assertThat(day.maximumGap(nums), is(equalTo(3)));
        assertThat(day.maximumGap2(nums), is(equalTo(3)));
    }

    @Test
    void testMaximumGaps2() {
        // Input: nums = [10]
        // Output: 0
        // Explanation: The array contains less than 2 elements, therefore return 0.
        int[] nums = {10};
        assertThat(day.maximumGap(nums), is(equalTo(0)));
        assertThat(day.maximumGap2(nums), is(equalTo(0)));
    }

}