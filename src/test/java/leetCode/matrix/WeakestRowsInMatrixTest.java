package leetCode.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class WeakestRowsInMatrixTest {

    private WeakestRowsInMatrix day;

    @BeforeEach
    void setUp() {
        day = new WeakestRowsInMatrix();
    }

    @Test
    void testKWeakestRows() {
        int[][] mat = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int[] result = new int[]{2, 0, 3};
        assertThat(day.kWeakestRows(mat, 3), is(equalTo(result)));
    }

    @Test
    void testKWeakestRows2() {
        int[][] mat = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int[] result = new int[]{0, 2};
        assertThat(day.kWeakestRows(mat, 2), is(equalTo(result)));
    }

}