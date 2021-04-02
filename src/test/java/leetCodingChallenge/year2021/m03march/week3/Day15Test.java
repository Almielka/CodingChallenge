package leetCodingChallenge.year2021.m03march.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


class Day15Test {

    private Day15.Codec day;
    private static final String URL = "https://leetcode.com/problems/design-tinyurl";

    @BeforeEach
    void setUp() {
        day = new Day15().new Codec();
    }

    @Test
    void testEncode() {
        assertThat(day.decode(day.encode(URL)), is(equalTo(URL)));
    }

}