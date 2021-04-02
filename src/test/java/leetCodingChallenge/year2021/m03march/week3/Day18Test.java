package leetCodingChallenge.year2021.m03march.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day18Test {

    private Day18 day;

    @BeforeEach
    void setUp() {
        day = new Day18();
    }

    @Test
    void testWiggleMaxLength() {
        // Explanation: The entire sequence is a wiggle sequence
        int[] nums = {1, 7, 4, 9, 2, 5};
        assertThat(day.wiggleMaxLength(nums), is(equalTo(6)));
    }

    @Test
    void testWiggleMaxLength2() {
        // Explanation: There are several subsequences that achieve this length. One is [1,17,10,13,10,16,8]
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        assertThat(day.wiggleMaxLength(nums), is(equalTo(7)));
    }

    @Test
    void testWiggleMaxLength3() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(day.wiggleMaxLength(nums), is(equalTo(2)));
    }

    @Test
    void testWiggleMaxLength4() {
        int[] nums = {0, 0};
        assertThat(day.wiggleMaxLength(nums), is(equalTo(1)));
    }

    @Test
    void testWiggleMaxLength5() {
        int[] nums = {3, 3, 3, 2, 5};
        assertThat(day.wiggleMaxLength(nums), is(equalTo(3)));
    }

}