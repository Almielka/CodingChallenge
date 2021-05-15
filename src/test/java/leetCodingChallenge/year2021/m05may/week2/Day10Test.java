package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day10Test {

    private Day10 day;

    @BeforeEach
    void setUp() {
        day = new Day10();
    }

    @Test
    void testCountPrimes() {
        // Input: n = 10
        // Output: 4
        // Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
        assertThat(day.countPrimes(10), is(equalTo(4)));
    }

    @Test
    void testCountPrimes2() {
        assertThat(day.countPrimes(0), is(equalTo(0)));
    }

    @Test
    void testCountPrimes3() {
        assertThat(day.countPrimes(1), is(equalTo(0)));
    }

    @Test
    void testCountPrimes4() {
        assertThat(day.countPrimes(2), is(equalTo(0)));
    }

    @Test
    void testCountPrimes5() {
        assertThat(day.countPrimes(100), is(equalTo(25)));
    }

}
