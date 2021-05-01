package leetCodingChallenge.year2021.m04april.week5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day30Test {

    private Day30 day;

    @BeforeEach
    void setUp() {
        day = new Day30();
    }

    @Test
    void testPowerfulIntegers() {
        // Input: x = 2, y = 3, bound = 10
        // Output: [2,3,4,5,7,9,10]
        // Explanation:
        // 2 = 2^0 + 3^0
        // 3 = 2^1 + 3^0
        // 4 = 2^0 + 3^1
        // 5 = 2^1 + 3^1
        // 7 = 2^2 + 3^1
        // 9 = 2^3 + 3^0
        // 10 = 2^0 + 3^2
        int[] arr = {2, 3, 4, 5, 7, 9, 10};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.powerfulIntegers(2, 3, 10), is(equalTo(result)));
    }

    @Test
    void testPowerfulIntegers2() {
        // Input: x = 3, y = 5, bound = 15
        // Output: [2,4,6,8,10,14]
        int[] arr = {2, 4, 6, 8, 10, 14};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.powerfulIntegers(3, 5, 15), is(equalTo(result)));
    }

    @Test
    void testPowerfulIntegers3() {
        int[] arr = {2, 3, 5, 9};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertThat(day.powerfulIntegers(2, 1, 10), is(equalTo(result)));
    }

}