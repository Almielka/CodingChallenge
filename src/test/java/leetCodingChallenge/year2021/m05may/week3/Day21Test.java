package leetCodingChallenge.year2021.m05may.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day21Test {

    private Day21 day;

    @BeforeEach
    void setUp() {
        day = new Day21();
    }

    @Test
    void testFindAndReplacePattern() {
        // Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
        // Output: ["mee","aqq"]
        // Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
        // "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String[] arr = {"mee", "aqq"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.findAndReplacePattern(words, "abb"), is(equalTo(result)));
    }

    @Test
    void testFindAndReplacePattern2() {
        String[] words = {"a", "b", "c"};
        String[] arr = {"a", "b", "c"};
        List<String> result = Arrays.asList(arr);
        assertThat(day.findAndReplacePattern(words, "a"), is(equalTo(result)));
    }

}
