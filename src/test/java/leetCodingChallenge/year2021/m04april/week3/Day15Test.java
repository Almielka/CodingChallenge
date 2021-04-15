package leetCodingChallenge.year2021.m04april.week3;

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
    void testFib() {
        // Input: n = 2
        // Output: 1
        // Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
        assertThat(day.fib(2), is(equalTo(1)));
        assertThat(day.fib2(2), is(equalTo(1)));
    }

    @Test
    void testFib2() {
        // Input: n = 3
        // Output: 2
        // Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
        assertThat(day.fib(3), is(equalTo(2)));
        assertThat(day.fib2(3), is(equalTo(2)));
    }

    @Test
    void testFib3() {
        // Input: n = 4
        // Output: 3
        // Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
        assertThat(day.fib(4), is(equalTo(3)));
        assertThat(day.fib2(4), is(equalTo(3)));
    }

    @Test
    void testFib4() {
        assertThat(day.fib(30), is(equalTo(832040)));
        assertThat(day.fib2(30), is(equalTo(832040)));
    }

}