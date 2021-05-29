package leetCodingChallenge.year2021.m05may.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day29Test {

    private Day29 day;

    @BeforeEach
    void setUp() {
        day = new Day29();
    }

    @Test
    void testTotalNQueens() {
        // Input: n = 4
        // Output: 2
        // Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
        assertThat(day.totalNQueens(4), is(equalTo(2)));
    }

    @Test
    void testTotalNQueens2() {
        assertThat(day.totalNQueens(1), is(equalTo(1)));
    }

}