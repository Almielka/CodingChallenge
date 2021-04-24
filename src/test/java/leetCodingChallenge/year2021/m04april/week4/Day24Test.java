package leetCodingChallenge.year2021.m04april.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day24Test {

    private Day24 day;

    @BeforeEach
    void setUp() {
        day = new Day24();
    }

    @Test
    void testCriticalConnections() {
        // Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
        // Output: [[1,3]]
        // Explanation: [[3,1]] is also accepted.
        List<Integer> list1 = new ArrayList(Arrays.asList(0, 1));
        List<Integer> list2 = new ArrayList(Arrays.asList(1, 2));
        List<Integer> list3 = new ArrayList(Arrays.asList(2, 0));
        List<Integer> list4 = new ArrayList(Arrays.asList(1, 3));
        List<List<Integer>> connections = new ArrayList(Arrays.asList(list1, list2, list3, list4));
        List<List<Integer>> result = new ArrayList(Arrays.asList(list4));
        assertThat(day.criticalConnections(4, connections), is(result));
    }

}