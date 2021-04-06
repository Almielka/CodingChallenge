package leetCodingChallenge.year2021.m04april.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day06Test {

    private Day06 day;

    @BeforeEach
    void setUp() {
        day = new Day06();
    }

    @Test
    void testMinOperations() {
        // Input: n = 3
        // Output: 2
        // Explanation: arr = [1, 3, 5]
        // First operation choose x = 2 and y = 0, this leads arr to be [2, 3, 4]
        // In the second operation choose x = 2 and y = 0 again, thus arr = [3, 3, 3].
        assertThat(day.minOperations(3), is(equalTo(2)));
        assertThat(day.minOperations2(3), is(equalTo(2)));
        assertThat(day.minOperations3(3), is(equalTo(2)));
    }

    @Test
    void testMinOperations2() {
        assertThat(day.minOperations(6), is(equalTo(9)));
        assertThat(day.minOperations2(6), is(equalTo(9)));
        assertThat(day.minOperations3(6), is(equalTo(9)));
    }

    @Test
    void testMinOperations3() {
        assertThat(day.minOperations(1), is(equalTo(0)));
        assertThat(day.minOperations2(1), is(equalTo(0)));
        assertThat(day.minOperations3(1), is(equalTo(0)));
    }

    @Test
    void testMinOperations4() {
        assertThat(day.minOperations(10000), is(equalTo(25000000)));
        assertThat(day.minOperations2(10000), is(equalTo(25000000)));
        assertThat(day.minOperations3(10000), is(equalTo(25000000)));
    }

}