package leetCode.easyAlgorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class LongestHarmoniousSubsequenceTest {

    private LongestHarmoniousSubsequence day;

    @BeforeEach
    void setUp() {
        day = new LongestHarmoniousSubsequence();
    }

    @Test
    void testFindLHS() {
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        assertThat(day.findLHS(nums), is(equalTo(5)));
    }

    @Test
    void testFindLHS2() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertThat(day.findLHS(nums), is(equalTo(2)));
    }

    @Test
    void testFindLHS3() {
        int[] nums = new int[]{1, 1, 1, 1};
        assertThat(day.findLHS(nums), is(equalTo(0)));
    }

    @Test
    void testFindLHS4() {
        int[] nums = new int[]{1, 2, 2, 1};
        assertThat(day.findLHS(nums), is(equalTo(4)));
    }

}