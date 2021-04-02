package leetCodingChallenge.year2021.m03march.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day21Test {

    private Day21 day;

    @BeforeEach
    void setUp() {
        day = new Day21();
    }

    @Test
    void testReorderedPowerOf2() {
        assertThat(day.reorderedPowerOf2(1), is(equalTo(true)));
    }

    @Test
    void testReorderedPowerOf2test2() {
        assertThat(day.reorderedPowerOf2(10), is(equalTo(false)));
    }

    @Test
    void testReorderedPowerOf2test3() {
        assertThat(day.reorderedPowerOf2(16), is(equalTo(true)));
    }

    @Test
    void testReorderedPowerOf2test4() {
        assertThat(day.reorderedPowerOf2(24), is(equalTo(false)));
    }

    @Test
    void testReorderedPowerOf2test5() {
        assertThat(day.reorderedPowerOf2(46), is(equalTo(true)));
    }

    @Test
    void testReorderedPowerOf2test6() {
        assertThat(day.reorderedPowerOf2((int) Math.pow(2, 29)), is(equalTo(true)));
    }

    @Test
    void testReorderedPowerOf2test7() {
        assertThat(day.reorderedPowerOf2((int) Math.pow(10, 9)), is(equalTo(false)));
    }

}