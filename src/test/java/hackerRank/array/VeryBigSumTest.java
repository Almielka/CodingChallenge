package hackerRank.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class VeryBigSumTest {

    @Test
    void testSimpleArraySum() {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        Long result = 5000000015L;
        assertThat(VeryBigSum.aVeryBigSum(ar), comparesEqualTo(result));
    }

}