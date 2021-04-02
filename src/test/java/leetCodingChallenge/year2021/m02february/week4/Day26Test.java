package leetCodingChallenge.year2021.m02february.week4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day26Test {

    private Day26 day;

    @BeforeEach
    void setUp() {
        day = new Day26();
    }

    @Test
    void testValidateStackSequences() {
        // Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
        // Output: true
        // Explanation: We might do the following sequence:
        // push(1), push(2), push(3), push(4), pop() -> 4,
        // push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        assertThat(day.validateStackSequences(pushed, popped), is(equalTo(true)));
    }

    @Test
    void testValidateStackSequences2() {
        // Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
        // Output: false
        // Explanation: 1 cannot be popped before 2.
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};
        assertThat(day.validateStackSequences(pushed, popped), is(equalTo(false)));
    }

    @Test
    void testValidateStackSequences3() {
        int[] pushed = {0, 2, 1};
        int[] popped = {0, 1, 2};
        assertThat(day.validateStackSequences(pushed, popped), is(equalTo(true)));
    }

}