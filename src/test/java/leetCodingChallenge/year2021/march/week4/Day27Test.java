package leetCodingChallenge.year2021.march.week4;

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
    void testCountSubstrings() {
        // Explanation: Three palindromic strings: "a", "b", "c"
        assertThat(day.countSubstrings("abc"), is(equalTo(3)));
    }

    @Test
    void testCountSubstrings2() {
        // Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa"
        assertThat(day.countSubstrings("aaa"), is(equalTo(6)));
    }

}