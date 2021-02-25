package leetCode.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class GraphBipartiteTest {

    private GraphBipartite day;

    @BeforeEach
    void setUp() {
        day = new GraphBipartite();
    }

    @Test
    void testIsBipartite() {
        int[][] graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertThat(day.isBipartite(graph), is(equalTo(true)));
    }

    @Test
    void testIsBipartite2() {
        int[][] graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertThat(day.isBipartite(graph), is(equalTo(false)));
    }

}