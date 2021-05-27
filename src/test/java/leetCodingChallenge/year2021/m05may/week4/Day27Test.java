package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day27Test {

    private Day27 day;

    @BeforeEach
    void setUp() {
        day = new Day27();
    }

    @Test
    void testMaxProduct() {
        // Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
        // Output: 16
        // Explanation: The two words can be "abcw", "xtfn"
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        assertThat(day.maxProduct(words), is(equalTo(16)));
        assertThat(day.maxProduct2(words), is(equalTo(16)));
    }

    @Test
    void testMaxProduct2() {
        // Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
        // Output: 4
        // Explanation: The two words can be "ab", "cd"
        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        assertThat(day.maxProduct(words), is(equalTo(4)));
        assertThat(day.maxProduct2(words), is(equalTo(4)));
    }

    @Test
    void testMaxProduct3() {
        // Input: words = ["a","aa","aaa","aaaa"]
        // Output: 0
        // Explanation: No such pair of words
        String[] words = {"a", "aa", "aaa", "aaaa"};
        assertThat(day.maxProduct(words), is(equalTo(0)));
        assertThat(day.maxProduct2(words), is(equalTo(0)));
    }

}
