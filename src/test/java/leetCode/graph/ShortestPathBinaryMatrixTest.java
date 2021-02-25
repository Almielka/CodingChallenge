package leetCode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ShortestPathBinaryMatrixTest {

    private ShortestPathBinaryMatrix day;

    @BeforeEach
    void setUp() {
        day = new ShortestPathBinaryMatrix();
    }

    @Test
    void testShortestPathBinaryMatrix() {
        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(2)));
    }

    @Test
    void testShortestPathBinaryMatrix2() {
        int[][] grid = new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(4)));
    }

    @Test
    void testShortestPathBinaryMatrix3() {
        int[][] grid = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(-1)));
    }

    @Test
    void testShortestPathBinaryMatrix4() {
        int[][] grid = new int[][]{{0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(1)));
    }

    @Test
    void testShortestPathBinaryMatrix5() {
        int[][] grid = new int[][]{{0, 0, 0, 0, 1}, {1, 0, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(-1)));
    }

    @Test
    void testShortestPathBinaryMatrix6() {
        int[][] grid = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertThat(day.shortestPathBinaryMatrix(grid), is(equalTo(3)));
    }

}