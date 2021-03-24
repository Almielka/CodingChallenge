package hackerRank.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SimpleArraySumTest {

    @Test
    void testSimpleArraySum() {
        int[] ar = {1, 2, 3, 4, 10, 11};
        assertThat(SimpleArraySum.simpleArraySum(ar), is(equalTo(31)));
    }

}