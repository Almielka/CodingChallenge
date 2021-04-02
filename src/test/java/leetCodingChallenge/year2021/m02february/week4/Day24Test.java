package leetCodingChallenge.year2021.m02february.week4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day24Test {

    private Day24 day;

    @BeforeEach
    void setUp() {
        day = new Day24();
    }

    @Test
    void testScoreOfParentheses() {
        assertThat(day.scoreOfParentheses("()"), is(equalTo(1)));
    }

    @Test
    void testScoreOfParentheses2() {
        assertThat(day.scoreOfParentheses("(())"), is(equalTo(2)));
    }

    @Test
    void testScoreOfParentheses3() {
        assertThat(day.scoreOfParentheses("()()"), is(equalTo(2)));
    }

    @Test
    void testScoreOfParentheses4() {
        assertThat(day.scoreOfParentheses("(()(()))"), is(equalTo(6)));
    }

    @Test
    void testScoreOfParentheses5() {
        assertThat(day.scoreOfParentheses("()()()"), is(equalTo(3)));
    }

}