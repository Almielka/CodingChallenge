package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day28Test {

    private Day28 day;

    @BeforeEach
    void setUp() {
        day = new Day28();
    }

    @Test
    void testMaximumUniqueSubarray() {
        // Input: nums = [4,2,4,5,6]
        // Output: 17
        // Explanation: The optimal subarray here is [2,4,5,6].
        int[] nums = {4, 2, 4, 5, 6};
        assertThat(day.maximumUniqueSubarray(nums), is(equalTo(17)));
    }

    @Test
    void testMaximumUniqueSubarray2() {
        // Input: nums = [5,2,1,2,5,2,1,2,5]
        // Output: 8
        // Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
        int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertThat(day.maximumUniqueSubarray(nums), is(equalTo(8)));
    }

}