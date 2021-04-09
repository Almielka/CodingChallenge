package leetCodingChallenge.year2021.m04april.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day09Test {

    private Day09 day;

    @BeforeEach
    void setUp() {
        day = new Day09();
    }

    @Test
    void testIsAlienSorted() {
        // Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
        // Output: true
        // Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertThat(day.isAlienSorted(words, order), is(equalTo(true)));
    }

    @Test
    void testIsAlienSorted2() {
        // IExplanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        assertThat(day.isAlienSorted(words, order), is(equalTo(false)));
    }

    @Test
    void testIsAlienSorted3() {
        // Explanation: The first three characters "app" match, and the second string is shorter (in size.)
        // According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined
        // as the blank character which is less than any other character (More info).
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertThat(day.isAlienSorted(words, order), is(equalTo(false)));
    }

}