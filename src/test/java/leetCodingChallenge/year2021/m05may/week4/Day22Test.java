package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day22Test {

    private Day22 day;

    @BeforeEach
    void setUp() {
        day = new Day22();
    }

    @Test
    void testSolveNQueens() {
        // Input: n = 4
        // Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
        List<String> list1 = Arrays.asList(".Q..", "...Q", "Q...", "..Q.");
        List<String> list2 = Arrays.asList("..Q.", "Q...", "...Q", ".Q..");
        List<List<String>> queens = new ArrayList<>();
        queens.add(list1);
        queens.add(list2);
        assertThat(day.solveNQueens(4), is(equalTo(queens)));
    }

    @Test
    void testSolveNQueens2() {
        List<String> list1 = Collections.singletonList("Q");
        List<List<String>> queens = new ArrayList<>();
        queens.add(list1);
        assertThat(day.solveNQueens(1), is(equalTo(queens)));
    }

}