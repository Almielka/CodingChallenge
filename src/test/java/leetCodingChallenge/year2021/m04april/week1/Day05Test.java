package leetCodingChallenge.year2021.m04april.week1;

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
    void testIsIdealPermutation() {
        int[] input = {1, 0, 2};
        assertThat(day.isIdealPermutation(input), is(equalTo(true)));
    }

    @Test
    void testIsIdealPermutation2() {
        int[] input = {1, 2, 0};
        assertThat(day.isIdealPermutation(input), is(equalTo(false)));
    }

    @Test
    void testIsIdealPermutation3() {
        int[] input = {2, 0, 1};
        assertThat(day.isIdealPermutation(input), is(equalTo(false)));
    }

}