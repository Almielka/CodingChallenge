package leetCodingChallenge.year2021.m04april.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day16Test {

    private Day16 day;

    @BeforeEach
    void setUp() {
        day = new Day16();
    }

    @Test
    void testRemoveDuplicates() {
        // Input: s = "abcd", k = 2
        // Output: "abcd"
        // Explanation: There's nothing to delete.
        assertThat(day.removeDuplicates("abcd", 2), is(equalTo("abcd")));
    }

    @Test
    void testRemoveDuplicates2() {
        // Input: s = "deeedbbcccbdaa", k = 3
        // Output: "aa"
        // Explanation:
        // First delete "eee" and "ccc", get "ddbbbdaa"
        // Then delete "bbb", get "dddaa"
        // Finally delete "ddd", get "aa"
        assertThat(day.removeDuplicates("deeedbbcccbdaa", 3), is(equalTo("aa")));
    }

    @Test
    void testRemoveDuplicates3() {
        // Input: s = "pbbcggttciiippooaais", k = 2
        // Output: "ps"
        assertThat(day.removeDuplicates("pbbcggttciiippooaais", 2), is(equalTo("ps")));
    }

}