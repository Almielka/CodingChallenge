package leetCodingChallenge.year2021.m02february.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day01Test {

    private Day01 day;

    @BeforeEach
    void setUp() {
        day = new Day01();
    }

    @Test
    void testHammingWeight() {
        assertThat(day.hammingWeight(11), is(equalTo(3)));
    }

    @Test
    void testHammingWeight2() {
        assertThat(day.hammingWeight(128), is(equalTo(1)));
    }

    @Test
    void testHammingWeight3() {
        assertThat(day.hammingWeight(0xFFFFFFFD), is(equalTo(31)));
    }

}