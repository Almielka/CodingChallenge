package hackerRank.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class LeftRotationTest {

    private LeftRotation solution;

    @BeforeEach
    void setUp() {
        solution = new LeftRotation();
    }

    @Test
    void testRotLeft() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {5, 1, 2, 3, 4};
        assertThat(solution.rotLeft(arr, 4), is(equalTo(result)));
    }

    @Test
    void testRotLeft2() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {3, 4, 5, 1, 2};
        assertThat(solution.rotLeft(arr, 2), is(equalTo(result)));
    }

}