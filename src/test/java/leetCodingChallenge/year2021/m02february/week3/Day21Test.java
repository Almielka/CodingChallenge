package leetCodingChallenge.year2021.m02february.week3;

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
    void testBrokenCalc() {
        assertThat(day.brokenCalc(2, 3), is(equalTo(2)));
    }

    @Test
    void testBrokenCalc2() {
        assertThat(day.brokenCalc(5, 8), is(equalTo(2)));
    }

    @Test
    void testBrokenCalc3() {
        assertThat(day.brokenCalc(3, 10), is(equalTo(3)));
    }

    @Test
    void testBrokenCalc4() {
        assertThat(day.brokenCalc(1024, 1), is(equalTo(1023)));
    }

    @Test
    void testBrokenCalc5() {
        assertThat(day.brokenCalc(1,1_000_000_000), is(equalTo(39)));
    }

}