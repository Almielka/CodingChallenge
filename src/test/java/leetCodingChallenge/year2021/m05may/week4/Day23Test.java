package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day23Test {

    private Day23 day;

    @BeforeEach
    void setUp() {
        day = new Day23();
    }

    @Test
    void testShortestSuperString() {
        // Input: words = ["alex","loves","leetcode"]
        // Output: "alexlovesleetcode"
        // Explanation: All permutations of "alex","loves","leetcode" would also be accepted.
        String[] words = {"alex", "loves", "leetcode"};
        assertThat(day.shortestSuperString(words), is(equalTo("alexlovesleetcode")));
    }

    @Test
    void testShortestSuperstring2() {
        String[] words = {"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        assertThat(day.shortestSuperString(words), is(equalTo("gctaagttcatgcatc")));
    }

}
