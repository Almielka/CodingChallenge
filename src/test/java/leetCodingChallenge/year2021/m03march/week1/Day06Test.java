package leetCodingChallenge.year2021.m03march.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day06Test {

    private Day06 day;

    @BeforeEach
    void setUp() {
        day = new Day06();
    }

    @Test
    void testMinimumLengthEncoding() {
        // Input: words = ["time", "me", "bell"]
        // Output: 10
        // Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
        // words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
        // words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
        // words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
        String[] words = {"time", "me", "bell"};
        assertThat(day.minimumLengthEncoding(words), is(equalTo(10)));
    }

    @Test
    void testMinimumLengthEncoding2() {
        // Input: words = ["t"]
        // Output: 2
        // Explanation: A valid encoding would be s = "t#" and indices = [0].
        String[] words = {"t"};
        assertThat(day.minimumLengthEncoding(words), is(equalTo(2)));
    }

    @Test
    void testMinimumLengthEncoding3() {
        String[] words = {"feipyxx", "e"};
        assertThat(day.minimumLengthEncoding(words), is(equalTo(10)));
    }

    @Test
    void testMinimumLengthEncoding4() {
        String[] words = {"me", "time"};
        assertThat(day.minimumLengthEncoding(words), is(equalTo(5)));
    }

}