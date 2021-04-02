package leetCodingChallenge.year2021.m03march.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testMinimumLengthEncoding() {
        // Input: s = "ababa"
        // Output: 1
        // Explanation: String is already palindrome
        assertThat(day.removePalindromeSub("ababa"), is(equalTo(1)));
    }

    @Test
    void testMinimumLengthEncoding2() {
        // Input: s = "abb"
        // Output: 2
        // Explanation: "abb" -> "bb" -> "".
        // Remove palindromic subsequence "a" then "bb".
        assertThat(day.removePalindromeSub("abb"), is(equalTo(2)));
    }

    @Test
    void testMinimumLengthEncoding3() {
        // Input: s = "baabb"
        // Output: 2
        // Explanation: "baabb" -> "b" -> "".
        // Remove palindromic subsequence "baab" then "b".
        assertThat(day.removePalindromeSub("baabb"), is(equalTo(2)));
    }

    @Test
    void testMinimumLengthEncoding4() {
        // Input: s = ""
        // Output: 0
        assertThat(day.removePalindromeSub(""), is(equalTo(0)));
    }

}
