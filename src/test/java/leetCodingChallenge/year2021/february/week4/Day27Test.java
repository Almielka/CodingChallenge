package leetCodingChallenge.year2021.february.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day27Test {

    private Day27 day;

    @BeforeEach
    void setUp() {
        day = new Day27();
    }

    @Test
    void testDivide() {
        // Explanation: 10/3 = truncate(3.33333..) = 3.
        assertThat(day.divide(10, 3), is(equalTo(3)));
    }

    @Test
    void testDivide2() {
        // Explanation: 7/-3 = truncate(-2.33333..) = -2.
        assertThat(day.divide(7, -3), is(equalTo(-2)));
    }

    @Test
    void testDivide3() {
        assertThat(day.divide(0, 1), is(equalTo(0)));
    }

    @Test
    void testDivide4() {
        assertThat(day.divide(1, 1), is(equalTo(1)));
    }

    @Test
    void testDivide5() {
        assertThat(day.divide(-1, -1), is(equalTo(1)));
    }

    @Test
    void testDivide6() {
        assertThat(day.divide(-2147483648, -1), is(equalTo(2147483647)));
    }

}