package leetCodingChallenge.year2021.m04april.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day12Test {

    private Day12 day;

    @BeforeEach
    void setUp() {
        day = new Day12();
    }

    @Test
    void testConstructArray() {
        // Input: n = 3, k = 1
        // Output: [1, 2, 3]
        // Explanation: The [1, 2, 3] has three different positive integers ranging from 1 to 3,
        // and the [1, 1] has exactly 1 distinct integer: 1.
        int[] result = {1, 2, 3};
        assertThat(day.constructArray(3, 1), is(equalTo(result)));
    }

    @Test
    void testConstructArray2() {
        // Input: n = 3, k = 2
        // Output: [1, 3, 2]
        // Explanation: The [1, 3, 2] has three different positive integers ranging from 1 to 3,
        // and the [2, 1] has exactly 2 distinct integers: 1 and 2.
        int[] result = {3, 1, 2};
        assertThat(day.constructArray(3, 2), is(equalTo(result)));
    }

    @Test
    void testConstructArray3() {
        int[] result = {4, 1, 2, 3};
        assertThat(day.constructArray(4, 2), is(equalTo(result)));
    }

    @Test
    void testConstructArray4() {
        int[] result = {1, 4, 2, 3};
        assertThat(day.constructArray(4, 3), is(equalTo(result)));
    }

    @Test
    void testConstructArray5() {
        int[] result = {5, 1, 4, 2, 3};
        assertThat(day.constructArray(5, 4), is(equalTo(result)));
    }

}