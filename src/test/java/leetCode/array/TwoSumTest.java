package leetCode.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class TwoSumTest {

    @Test
    void testTwoSum() {
        int[] arr = {2, 7, 11, 15};
        TwoSum solution = new TwoSum();
        int[] result = {0, 1};
        assertThat(solution.twoSum(arr, 9), is(equalTo(result)));
    }

    @Test
    void testTwoSum2() {
        int[] arr = {3, 2, 4};
        TwoSum solution = new TwoSum();
        int[] result = {1, 2};
        assertThat(solution.twoSum(arr, 6), is(equalTo(result)));
    }

    @Test
    void testTwoSum3() {
        int[] arr = {3, 3, 4};
        TwoSum solution = new TwoSum();
        int[] result = {0, 1};
        assertThat(solution.twoSum(arr, 6), is(equalTo(result)));
    }

}