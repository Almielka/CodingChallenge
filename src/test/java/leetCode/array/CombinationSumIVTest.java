package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class CombinationSumIVTest {

    private CombinationSumIV day;

    @BeforeEach
    void setUp() {
        day = new CombinationSumIV();
    }

    @Test
    void testCombinationSum4() {
        // Input: nums = [1,2,3], target = 4
        // Output: 7
        // Explanation:
        // The possible combination ways are:
        // (1, 1, 1, 1)
        // (1, 1, 2)
        // (1, 2, 1)
        // (1, 3)
        // (2, 1, 1)
        // (2, 2)
        // (3, 1)
        // Note that different sequences are counted as different combinations.
        int[] nums = {1, 2, 3};
        assertThat(day.combinationSum4(nums, 4), is(equalTo(7)));
    }

    @Test
    void testCombinationSum4ThanZero() {
        int[] nums = {9};
        assertThat(day.combinationSum4(nums, 3), is(equalTo(0)));
    }

}