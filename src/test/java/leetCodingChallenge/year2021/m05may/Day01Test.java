package leetCodingChallenge.year2021.m05may;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day01Test {

    Day01.WordFilter wordFilter;

    @Test
    void testWordFilter() {
        // Input
        // ["WordFilter", "f"]
        // [[["apple"]], ["a", "e"]]
        // Output
        // [null, 0]
        // Explanation
        // WordFilter wordFilter = new WordFilter(["apple"]);
        // wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = "a" and suffix = 'e".
        String[] words = {"apple"};
        wordFilter = new Day01().new WordFilter(words);
        assertThat(wordFilter.f("a", "e"), is(equalTo(0)));
    }

    @Test
    void testWordFilter2() {
        String[] words = {"apple", "apple"};
        wordFilter = new Day01().new WordFilter(words);
        assertThat(wordFilter.f("a", "e"), is(equalTo(1)));
    }

}