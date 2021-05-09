package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day09Test {

    private Day09 day;

    @BeforeEach
    void setUp() {
        day = new Day09();
    }

    @Test
    void testIsPossible() {
        // Input: target = [9,3,5]
        // Output: true
        // Explanation: Start with [1, 1, 1]
        // [1, 1, 1], sum = 3 choose index 1
        // [1, 3, 1], sum = 5 choose index 2
        // [1, 3, 5], sum = 9 choose index 0
        // [9, 3, 5] Done
        int[] target = {9, 3, 5};
        assertThat(day.isPossible(target), is(equalTo(true)));
    }

    @Test
    void testIsPossible2() {
        // Input: target = [1,1,1,2]
        // Output: false
        // Explanation: Impossible to create target array from [1,1,1,1]
        int[] target = {1, 1, 1, 2};
        assertThat(day.isPossible(target), is(equalTo(false)));
    }

    @Test
    void testIsPossible3() {
        int[] target = {8, 5};
        assertThat(day.isPossible(target), is(equalTo(true)));
    }

    @Test
    void testIsPossible4() {
        int[] target = {9, 9, 9};
        assertThat(day.isPossible(target), is(equalTo(false)));
    }

    @Test
    void testIsPossible5() {
        int[] target = {9, 3, 10};
        assertThat(day.isPossible(target), is(equalTo(false)));
    }

    @Test
    void testIsPossible6() {
        int[] target = {1, 1000000000};
        assertThat(day.isPossible(target), is(equalTo(true)));
    }

}
