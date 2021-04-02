package leetCodingChallenge.year2021.m03march.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day31Test {

    private Day31 day;

    @BeforeEach
    void setUp() {
        day = new Day31();
    }

    @Test
    void testMovesToStamp() {
        int[] result = {0, 2};
        assertThat(day.movesToStamp("abc", "ababc"), is(equalTo(result)));
    }

    @Test
    void testMovesToStamp2() {
        int[] result = {0, 3, 1};
        assertThat(day.movesToStamp("abca", "aabcaca"), is(equalTo(result)));
    }

    @Test
    void testMovesToStamp3() {
        int[] result = {0, 10, 8, 5, 4, 3, 1};
        assertThat(day.movesToStamp("abca", "aabcacaaabcaca"), is(equalTo(result)));
    }

    @Test
    void testMovesToStamp4() {
        int[] result = {};
        assertThat(day.movesToStamp("mda", "mdadddaaaa"), is(equalTo(result)));
    }

}