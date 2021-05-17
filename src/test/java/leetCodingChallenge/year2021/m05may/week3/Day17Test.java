package leetCodingChallenge.year2021.m05may.week3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day17Test {

    private Day17 day;

    @BeforeEach
    void setUp() {
        day = new Day17();
    }

    @Test
    void testLongestStrChain() {
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        assertThat(day.longestStrChain(words), is(equalTo(4)));
    }

    @Test
    void testLongestStrChain2() {
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        assertThat(day.longestStrChain(words), is(equalTo(5)));
    }

}
