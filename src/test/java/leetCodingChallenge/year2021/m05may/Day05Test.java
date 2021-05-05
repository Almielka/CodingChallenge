package leetCodingChallenge.year2021.m05may;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day05Test {

    private Day05 day;

    @BeforeEach
    void setUp() {
        day = new Day05();
    }

    @Test
    void testJump() {
        // Input: nums = [2,3,1,1,4]
        // Output: 2
        // Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
        int[] nums = {2, 3, 1, 1, 4};
        assertThat(day.jump(nums), is(equalTo(2)));
    }

    @Test
    void testJump2() {
        int[] nums = {2, 3, 0, 1, 4};
        assertThat(day.jump(nums), is(equalTo(2)));
    }


}
