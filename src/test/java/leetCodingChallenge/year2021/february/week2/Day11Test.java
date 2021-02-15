package leetCodingChallenge.year2021.february.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day11Test {

    private Day11 day;

    @BeforeEach
    void setUp() {
        day = new Day11();
    }

    @Test
    void testIsAnagram() {
        assertThat(day.isAnagram("anagram", "nagaram"), is(equalTo(true)));
    }

    @Test
    void testIsAnagram2() {
        assertThat(day.isAnagram("rat", "car"), is(equalTo(false)));
    }

}