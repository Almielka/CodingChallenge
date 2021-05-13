package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
    void testAmbiguousCoordinates() {
        // Input: s = "(123)"
        // Output: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]
        String[] arr = {"(1, 23)", "(1, 2.3)", "(12, 3)", "(1.2, 3)"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.ambiguousCoordinates("(123)"), is(equalTo(result)));
    }

    @Test
    void testAmbiguousCoordinates2() {
        // Input: s = "(00011)"
        // Output:  ["(0.001, 1)", "(0, 0.011)"]
        // Explanation:
        // 0.0, 00, 0001 or 00.01 are not allowed.
        String[] arr = {"(0, 0.011)", "(0.001, 1)"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.ambiguousCoordinates("(00011)"), is(equalTo(result)));
    }

    @Test
    void testAmbiguousCoordinates3() {
        // Input: s = "(0123)"
        // Output: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]
        String[] arr = {"(0, 123)", "(0, 1.23)", "(0, 12.3)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.ambiguousCoordinates("(0123)"), is(equalTo(result)));
    }

    @Test
    void testAmbiguousCoordinates4() {
        // Input: s = "(100)"
        // Output: [(10, 0)]
        // Explanation:
        // 1.0 is not allowed.
        String[] arr = {"(10, 0)"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.ambiguousCoordinates("(100)"), is(equalTo(result)));
    }

}
