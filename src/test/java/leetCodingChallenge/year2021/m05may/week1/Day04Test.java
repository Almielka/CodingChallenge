package leetCodingChallenge.year2021.m05may.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day04Test {

    private Day04 day;

    @BeforeEach
    void setUp() {
        day = new Day04();
    }

    @Test
    void testCheckPossibility() {
        // Input: nums = [4,2,3]
        // Output: true
        // Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
        int[] nums = {4, 2, 3};
        assertThat(day.checkPossibility(nums), is(equalTo(true)));
    }

    @Test
    void testCheckPossibility2() {
        // Input: nums = [4,2,1]
        // Output: false
        // Explanation: You can't get a non-decreasing array by modify at most one element.
        int[] nums = {4, 2, 1};
        assertThat(day.checkPossibility(nums), is(equalTo(false)));
    }

    @Test
    void testCheckPossibility3() {
        int[] nums = {3, 4, 2, 3};
        assertThat(day.checkPossibility(nums), is(equalTo(false)));
    }

    @Test
    void testCheckPossibility4() {
        int[] nums = {-1, 4, 2, 3};
        assertThat(day.checkPossibility(nums), is(equalTo(true)));
    }

}
