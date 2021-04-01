package hackerRank.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class DiagonalDifferenceTest {

    @Test
    void testDiagonalDifference() {
        List<Integer> one = Arrays.asList(1, 2, 3);
        List<Integer> two = Arrays.asList(4, 5, 6);
        List<Integer> three = Arrays.asList(9, 8, 9);
        List<List<Integer>> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);

        assertThat(DiagonalDifference.diagonalDifference(list), is(equalTo(2)));
    }

    @Test
    void testDiagonalDifference2() {
        List<Integer> one = Arrays.asList(11, 2, 4);
        List<Integer> two = Arrays.asList(4, 5, 6);
        List<Integer> three = Arrays.asList(10, 8, -12);
        List<List<Integer>> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);

        assertThat(DiagonalDifference.diagonalDifference(list), is(equalTo(15)));
    }

}