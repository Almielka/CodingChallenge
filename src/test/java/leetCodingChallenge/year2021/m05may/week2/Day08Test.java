package leetCodingChallenge.year2021.m05may.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Day08Test {

    private Day08 day;

    @BeforeEach
    void setUp() {
        day = new Day08();
    }

    @Test
    void testSuperPalindromesInRange() {
        // Input: left = "4", right = "1000"
        // Output: 4
        // Explanation: 4, 9, 121, and 484 are superPalindromes.
        // Note that 676 is not a superPalindrome: 26 * 26 = 676, but 26 is not a palindrome.
        assertThat(day.superPalindromesInRange("4", "1000"), is(4));
    }

    @Test
    void testSuperPalindromesInRange2() {
        assertThat(day.superPalindromesInRange("1", "2"), is(1));
    }

}