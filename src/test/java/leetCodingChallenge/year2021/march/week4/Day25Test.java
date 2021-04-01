package leetCodingChallenge.year2021.march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;

class Day25Test {

    private Day25 day;

    @BeforeEach
    void setUp() {
        day = new Day25();
    }

    @Test
    void testPacificAtlantic() {
        // Given the following 5x5 matrix:
        //  Pacific ~   ~   ~   ~   ~
        //       ~  1   2   2   3  (5) *
        //       ~  3   2   3  (4) (4) *
        //       ~  2   4  (5)  3   1  *
        //       ~ (6) (7)  1   4   5  *
        //       ~ (5)  1   1   2   4  *
        //          *   *   *   *   * Atlantic
        // Return:
        // [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
        int[][] matrix = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        String s = "[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]";
        List<List<Integer>> result = Arrays.stream(s.split("], \\["))
                .map(row -> row.replace("[[", "").replace("]]", ""))
                .map(row -> Arrays.stream(row.split(", "))
                        .map(Integer::parseInt).collect(Collectors.toList())
                ).collect(Collectors.toList());
        assertThat(day.pacificAtlantic(matrix), is(samePropertyValuesAs(result)));
    }

    @Test
    void testPacificAtlantic2() {
        int[][] matrix = {{1, 2, 2, 3, 5, 1, 1, 1, 3}, {3, 2, 3, 4, 4, 2, 2, 2, 3}, {2, 4, 5, 3, 2, 1, 5, 1, 4},
                {6, 7, 1, 4, 5, 1, 6, 4, 2}, {5, 1, 1, 2, 4, 4, 1, 1, 4}};
        String s = "[[0, 8], [1, 8], [2, 2], [2, 8], [3, 0], [3, 1], [3, 6], [4, 0]]";
        List<List<Integer>> result = Arrays.stream(s.split("], \\["))
                .map(row -> row.replace("[[", "").replace("]]", ""))
                .map(row -> Arrays.stream(row.split(", "))
                        .map(Integer::parseInt).collect(Collectors.toList())
                ).collect(Collectors.toList());
        assertThat(day.pacificAtlantic(matrix), is(samePropertyValuesAs(result)));
    }

}