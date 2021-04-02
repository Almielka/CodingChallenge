package leetCodingChallenge.year2021.m03march.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day30Test {

    private Day30 day;

    @BeforeEach
    void setUp() {
        day = new Day30();
    }

    @Test
    void testMaxEnvelopes() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        assertThat(day.maxEnvelopes(envelopes), is(equalTo(3)));
    }

    @Test
    void testMaxEnvelopes2() {
        int[][] envelopes = {{1, 1}, {1, 1}, {1, 1}};
        assertThat(day.maxEnvelopes(envelopes), is(equalTo(1)));
    }

    @Test
    void testMaxEnvelopes3() {
        int[][] envelopes = {{2, 100}, {3, 200}, {4, 300}, {5, 500}, {5, 400}, {5, 250}, {6, 370}, {6, 360}, {7, 380}};
        assertThat(day.maxEnvelopes(envelopes), is(equalTo(5)));
    }

}