package hackerRank.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BirthdayCakeCandlesTest {

    private BirthdayCakeCandles solution;

    @BeforeEach
    void setUp() {
        solution = new BirthdayCakeCandles();
    }

    @Test
    void testBirthdayCakeCandles() {
        int[] arr = {4, 4, 1, 3};
        List<Integer> candles = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthdayCakeCandles(candles), is(equalTo(2)));
        assertThat(solution.birthdayCakeCandles2(candles), is(equalTo(2)));
    }

    @Test
    void testBirthdayCakeCandles2() {
        int[] arr = {3, 2, 1, 3};
        List<Integer> candles = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(solution.birthdayCakeCandles(candles), is(equalTo(2)));
        assertThat(solution.birthdayCakeCandles2(candles), is(equalTo(2)));
    }

}