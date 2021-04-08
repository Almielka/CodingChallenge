package leetCodingChallenge.year2021.m04april.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day03Test {

    private Day03 day;

    @BeforeEach
    void setUp() {
        day = new Day03();
    }

    @Test
    void testLongestValidParentheses() {
        // Input: s = "(()"
        // Output: 2
        // Explanation: The longest valid parentheses substring is "()".
        assertThat(day.longestValidParentheses("(()"), is(equalTo(2)));
    }

    @Test
    void testLongestValidParentheses2() {
        // Input: s = ")()())"
        // Output: 4
        // Explanation: The longest valid parentheses substring is "()()".
        assertThat(day.longestValidParentheses(")()())"), is(equalTo(4)));
    }

    @Test
    void testLongestValidParentheses3() {
        assertThat(day.longestValidParentheses(""), is(equalTo(0)));
    }

    @Test
    void testLongestValidParentheses4() {
        assertThat(day.longestValidParentheses("()(()"), is(equalTo(2)));
    }

    @Test
    void testLongestValidParentheses5() {
        assertThat(day.longestValidParentheses("((())"), is(equalTo(4)));
    }

}