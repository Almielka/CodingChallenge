package leetCode.easyAlgorithms.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Shift2DGridTest {
    private static Shift2DGrid solution;

    @BeforeAll
    static void setUp() {
        solution = new Shift2DGrid();
    }

    @Test
    void shiftGrid() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<List<Integer>> result = Arrays.asList(Arrays.asList(9, 1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8));
        assertThat(solution.shiftGrid(arr, 1), is(equalTo(result)));
    }

    @Test
    void shiftGrid2() {
        int[][] arr = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(12, 0, 21, 13),
                Arrays.asList(3, 8, 1, 9),
                Arrays.asList(19, 7, 2, 5),
                Arrays.asList(4, 6, 11, 10)
        );
        assertThat(solution.shiftGrid(arr, 4), is(equalTo(result)));
    }

}