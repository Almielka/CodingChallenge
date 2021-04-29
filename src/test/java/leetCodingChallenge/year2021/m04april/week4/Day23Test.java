package leetCodingChallenge.year2021.m04april.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day23Test {

    private Day23 day;

    @BeforeEach
    void setUp() {
        day = new Day23();
    }

    @Test
    void testCountBinarySubstrings() {
        // Input: "00110011"
        // Output: 6
        // Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
        // Notice that some of these substrings repeat and are counted the number of times they occur.
        // Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
        assertThat(day.countBinarySubstrings("00110011"), is(equalTo(6)));
    }

    @Test
    void testCountBinarySubstrings2() {
        // Input: "10101"
        // Output: 4
        // Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
        assertThat(day.countBinarySubstrings("10101"), is(equalTo(4)));
    }

}