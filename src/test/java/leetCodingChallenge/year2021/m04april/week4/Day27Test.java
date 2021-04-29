package leetCodingChallenge.year2021.m04april.week4;

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
    void testIsPowerOfThree() {
        assertThat(day.isPowerOfThree(27), is(equalTo(true)));
    }

    @Test
    void testIsPowerOfThree2() {
        assertThat(day.isPowerOfThree(0), is(equalTo(false)));
    }

    @Test
    void testIsPowerOfThree3() {
        assertThat(day.isPowerOfThree(9), is(equalTo(true)));
    }

    @Test
    void testIsPowerOfThree4() {
        assertThat(day.isPowerOfThree(45), is(equalTo(false)));
    }

}