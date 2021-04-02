package leetCodingChallenge.year2021.m02february.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day14Test {

    private Day14 day;

    @BeforeEach
    void setUp() {
        day = new Day14();
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