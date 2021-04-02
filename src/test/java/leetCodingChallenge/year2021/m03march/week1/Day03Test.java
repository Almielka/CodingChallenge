package leetCodingChallenge.year2021.m03march.week1;

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
    void testMissingNumber() {
        // Input: nums = [3,0,1]
        // Output: 2
        // Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
        // 2 is the missing number in the range since it does not appear in nums.
        int[] nums = {3, 0, 1};
        assertThat(day.missingNumber(nums), is(equalTo(2)));
    }

    @Test
    void testMissingNumber2() {
        // Input: nums = [0,1]
        // Output: 2
        // Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
        // 2 is the missing number in the range since it does not appear in nums.
        int[] nums = {0, 1};
        assertThat(day.missingNumber(nums), is(equalTo(2)));
    }

    @Test
    void testMissingNumber3() {
        // Input: nums = [9,6,4,2,3,5,7,0,1]
        // Output: 8
        // Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
        // 8 is the missing number in the range since it does not appear in nums.
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertThat(day.missingNumber(nums), is(equalTo(8)));
    }

    @Test
    void testMissingNumber4() {
        // Input: nums = [0]
        // Output: 1
        // Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1].
        // 1 is the missing number in the range since it does not appear in nums.
        int[] nums = {0};
        assertThat(day.missingNumber(nums), is(equalTo(1)));
    }

}