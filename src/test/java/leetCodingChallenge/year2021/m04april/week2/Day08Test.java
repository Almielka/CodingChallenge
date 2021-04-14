package leetCodingChallenge.year2021.m04april.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day08Test {

    private Day08 day;

    @BeforeEach
    void setUp() {
        day = new Day08();
    }

    @Test
    void testLetterCombinations() {
        String[] arr = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCombinations("23"), is(equalTo(result)));
    }

    @Test
    void testLetterCombinations2() {
        List<String> result = new ArrayList<>();
        assertThat(day.letterCombinations(""), is(equalTo(result)));
    }

    @Test
    void testLetterCombinations3() {
        String[] arr = {"a", "b", "c"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.letterCombinations("2"), is(equalTo(result)));
    }

}