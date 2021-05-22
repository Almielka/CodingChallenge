package leetCodingChallenge.year2021.m05may.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day15Test {

    private Day15 day;

    @BeforeEach
    void setUp() {
        day = new Day15();
    }

    @Test
    void testIsNumber() {
        assertThat(day.isNumber("0"), is(equalTo(true)));
    }

    @Test
    void testIsNumber2() {
        assertThat(day.isNumber("e"), is(equalTo(false)));
    }

    @Test
    void testIsNumber3() {
        assertThat(day.isNumber("."), is(equalTo(false)));
    }

    @Test
    void testIsNumber4() {
        assertThat(day.isNumber(".1"), is(equalTo(true)));
    }

    @Test
    void testIsNumber5() {
        assertThat(day.isNumber("+3.14"), is(equalTo(true)));
    }

    @Test
    void testIsNumber6() {
        assertThat(day.isNumber("90E3"), is(equalTo(true)));
    }

    @Test
    void testIsNumber7() {
        assertThat(day.isNumber("3e+7"), is(equalTo(true)));
    }

    @Test
    void testIsNumber8() {
        assertThat(day.isNumber("+6e-1"), is(equalTo(true)));
    }

    @Test
    void testIsNumber9() {
        assertThat(day.isNumber("53.5e93"), is(equalTo(true)));
    }

    @Test
    void testIsNumber10() {
        assertThat(day.isNumber("-123.456e789"), is(equalTo(true)));
    }

    @Test
    void testIsNumber11() {
        assertThat(day.isNumber("99e2.5"), is(equalTo(false)));
    }

    @Test
    void testIsNumber12() {
        assertThat(day.isNumber("-+3"), is(equalTo(false)));
    }

    @Test
    void testIsNumber13() {
        assertThat(day.isNumber("95a54e53"), is(equalTo(false)));
    }

    @Test
    void testIsNumber14() {
        assertThat(day.isNumber("1e"), is(equalTo(false)));
    }

    @Test
    void testIsNumber15() {
        assertThat(day.isNumber("e3"), is(equalTo(false)));
    }

}
