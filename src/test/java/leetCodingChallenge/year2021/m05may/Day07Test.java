package leetCodingChallenge.year2021.m05may;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day07Test {

    private Day07 day;

    @BeforeEach
    void setUp() {
        day = new Day07();
    }

    @Test
    void testMinDistance() {
        // Input: word1 = "sea", word2 = "eat"
        // Output: 2
        // Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
        assertThat(day.minDistance("sea", "eat"), is(2));
    }

    @Test
    void testMinDistance2() {
        // Input: word1 = "leetcode", word2 = "etco"
        // Output: 4
        assertThat(day.minDistance("leetcode", "etco"), is(4));
    }

}