package leetCodingChallenge.year2021.m04april.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day22Test {

    private Day22 day;

    @BeforeEach
    void setUp() {
        day = new Day22();
    }

    @Test
    void testLeastBricks() {
        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 2, 1));
        List<Integer> list2 = new ArrayList(Arrays.asList(3, 1, 2));
        List<Integer> list3 = new ArrayList(Arrays.asList(1, 3, 2));
        List<Integer> list4 = new ArrayList(Arrays.asList(2, 4));
        List<Integer> list5 = new ArrayList(Arrays.asList(3, 1, 2));
        List<Integer> list6 = new ArrayList(Arrays.asList(1, 3, 1, 1));
        List<List<Integer>> wall = new ArrayList(Arrays.asList(list1, list2, list3, list4, list5, list6));
        assertThat(day.leastBricks(wall), is(2));
    }

}