package leetCodingChallenge.year2021.march.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day13Test {

    private Day13 day;

    @BeforeEach
    void setUp() {
        day = new Day13();
    }

    @Test
    void testNumFactoredBinaryTrees() {
        // Input: arr = [2,4]
        // Output: 3
        // Explanation: We can make these trees: [2], [4], [4, 2, 2]
        int[] arr = {2, 4};
        assertThat(day.numFactoredBinaryTrees(arr), is(equalTo(3)));
    }

    @Test
    void testNumFactoredBinaryTrees2() {
        // Input: arr = [2,4,5,10]
        // Output: 7
        // Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
        int[] arr = {2, 4, 5, 10};
        assertThat(day.numFactoredBinaryTrees(arr), is(equalTo(7)));
    }

}