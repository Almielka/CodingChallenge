package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day24Test {

    private Day24 day;

    @BeforeEach
    void setUp() {
        day = new Day24();
    }

    @Test
    void testToLowerCase() {
        assertThat(day.toLowerCase("Hello"), is(equalTo("hello")));
    }

    @Test
    void testToLowerCase2() {
        assertThat(day.toLowerCase("here"), is(equalTo("here")));
    }

    @Test
    void testToLowerCase3() {
        assertThat(day.toLowerCase("LOVELY"), is(equalTo("lovely")));
    }

}
