package leetCode.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class OnesAndZeroesTest {

    private OnesAndZeroes day;

    @BeforeEach
    void setUp() {
        day = new OnesAndZeroes();
    }

    @Test
    void testFindMaxForm() {
        // Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
        // Output: 4
        // Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
        // Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
        // {"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
        String[] strs = {"10", "0001", "111001", "1", "0"};
        assertThat(day.findMaxForm(strs, 5, 3), is(equalTo(4)));
    }

    @Test
    void testFindMaxForm2() {
        String[] strs = {"10", "0", "1"};
        assertThat(day.findMaxForm(strs, 1, 1), is(equalTo(2)));
    }

    @Test
    void testFindMaxForm3() {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        assertThat(day.findMaxForm(strs, 4, 3), is(equalTo(3)));
    }

}