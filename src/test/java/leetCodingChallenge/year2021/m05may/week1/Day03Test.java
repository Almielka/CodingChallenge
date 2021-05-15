package leetCodingChallenge.year2021.m05may.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day03Test {

    private Day03 day;

    @BeforeEach
    void setUp() {
        day = new Day03();
    }

    @Test
    void testRunningSum() {
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        int[] nums = {1, 2, 3, 4};
        int[] result = {1, 3, 6, 10};
        assertThat(day.runningSum(nums), is(equalTo(result)));
    }

    @Test
    void testRunningSum2() {
        // Input: nums = [1,1,1,1,1]
        // Output: [1,2,3,4,5]
        // Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
        int[] nums = {1, 1, 1, 1, 1};
        int[] result = {1, 2, 3, 4, 5};
        assertThat(day.runningSum(nums), is(equalTo(result)));
    }

    @Test
    void testRunningSum3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] result = {3, 4, 6, 16, 17};
        assertThat(day.runningSum(nums), is(equalTo(result)));
    }

}