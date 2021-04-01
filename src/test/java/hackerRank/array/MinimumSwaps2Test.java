package hackerRank.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MinimumSwaps2Test {

    private MinimumSwaps2 solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumSwaps2();
    }

    @Test
    void testMinimumSwaps() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        assertThat(solution.minimumSwaps(arr), is(equalTo(5)));
    }

    @Test
    void testMinimumSwaps2() {
        int[] arr = {4, 3, 1, 2};
        assertThat(solution.minimumSwaps(arr), is(equalTo(3)));
    }

    @Test
    void testMinimumSwaps3() {
        int[] arr = {2, 3, 4, 1, 5};
        assertThat(solution.minimumSwaps(arr), is(equalTo(3)));
    }

    @Test
    void testMinimumSwaps4() {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        assertThat(solution.minimumSwaps(arr), is(equalTo(3)));
    }

}