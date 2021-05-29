package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day25Test {

    private Day25 day;

    @BeforeEach
    void setUp() {
        day = new Day25();
    }

    @Test
    void testEvalRPN() {
        // Input: tokens = ["2","1","+","3","*"]
        // Output: 9
        // Explanation: ((2 + 1) * 3) = 9
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertThat(day.evalRPN(tokens), is(equalTo(9)));
    }

    @Test
    void testEvalRPN2() {
        // Input: tokens = ["4","13","5","/","+"]
        // Output: 6
        // Explanation: (4 + (13 / 5)) = 6
        String[] tokens = {"4", "13", "5", "/", "+"};
        assertThat(day.evalRPN(tokens), is(equalTo(6)));
    }

    @Test
    void testEvalRPN3() {
        // Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        // Output: 22
        // Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
        // = ((10 * (6 / (12 * -11))) + 17) + 5
        // = ((10 * (6 / -132)) + 17) + 5
        // = ((10 * 0) + 17) + 5
        // = (0 + 17) + 5
        // = 17 + 5
        // = 22
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertThat(day.evalRPN(tokens), is(equalTo(22)));
    }

}
