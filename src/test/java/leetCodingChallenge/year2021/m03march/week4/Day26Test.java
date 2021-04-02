package leetCodingChallenge.year2021.m03march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day26Test {

    private Day26 day;

    @BeforeEach
    void setUp() {
        day = new Day26();
    }

    @Test
    void testWordSubsets() {
        String[] A = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = {"e", "o"};
        String[] arr = {"facebook", "google", "leetcode"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.wordSubsets(A, B), is(equalTo(result)));
    }

    @Test
    void testWordSubsets2() {
        String[] A = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = {"l", "e"};
        String[] arr = {"apple", "google", "leetcode"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.wordSubsets(A, B), is(equalTo(result)));
    }

    @Test
    void testWordSubsets3() {
        String[] A = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = {"e", "oo"};
        String[] arr = {"facebook", "google"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.wordSubsets(A, B), is(equalTo(result)));
    }

    @Test
    void testWordSubsets4() {
        String[] A = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = {"lo", "eo"};
        String[] arr = {"google", "leetcode"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.wordSubsets(A, B), is(equalTo(result)));
    }

    @Test
    void testWordSubsets5() {
        String[] A = {"facebook", "google", "leetcode"};
        String[] B = {"ec", "oc", "ceo"};
        String[] arr = {"facebook", "leetcode"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.wordSubsets(A, B), is(equalTo(result)));
    }

}