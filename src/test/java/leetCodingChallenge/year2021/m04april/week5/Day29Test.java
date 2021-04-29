package leetCodingChallenge.year2021.m04april.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day29Test {

    private Day29 day;

    @BeforeEach
    void setUp() {
        day = new Day29();
    }

    @Test
    void testSearchRange() {
        // Input: nums = [5,7,7,8,8,10], target = 8
        // Output: [3,4]
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = {3, 4};
        assertThat(day.searchRange(nums, 8), is(equalTo(result)));
    }

    @Test
    void testSearchRange2() {
        // Input: nums = [5,7,7,8,8,10], target = 6
        // Output: [-1,-1]
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = {-1, -1};
        assertThat(day.searchRange(nums, 6), is(equalTo(result)));
    }

    @Test
    void testSearchRange3() {
        // Input: nums = [], target = 0
        // Output: [-1,-1]
        int[] nums = {};
        int[] result = {-1, -1};
        assertThat(day.searchRange(nums, 0), is(equalTo(result)));
    }


}