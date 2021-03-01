package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ArithmeticSlicesTest {

    private ArithmeticSlices day;

    @BeforeEach
    void setUp() {
        day = new ArithmeticSlices();
    }

    @Test
    void testNumberOfArithmeticSlices() {
        // A = [1, 2, 3, 4]
        // return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
        int[] arr = {1, 2, 3, 4};
        assertThat(day.numberOfArithmeticSlices(arr), is(equalTo(3)));
    }

    @Test
    void testNumberOfArithmeticSlices2() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertThat(day.numberOfArithmeticSlices(arr), is(equalTo(10)));
    }

    @Test
    void testNumberOfArithmeticSlices3() {
        int[] arr = {1, 2, 3, 8, 9, 10};
        assertThat(day.numberOfArithmeticSlices(arr), is(equalTo(2)));
    }

}