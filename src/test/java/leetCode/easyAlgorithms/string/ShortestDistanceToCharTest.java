package leetCode.easyAlgorithms.string;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ShortestDistanceToCharTest {

    private ShortestDistanceToChar day;

    @BeforeEach
    void setUp() {
        day = new ShortestDistanceToChar();
    }

    @Test
    void testShortestToChar() {
        int[] result = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertThat(day.shortestToChar("loveleetcode", 'e'), is(equalTo(result)));
    }

    @Test
    void testShortestToChar2() {
        int[] result = new int[]{3, 2, 1, 0};
        assertThat(day.shortestToChar("aaab", 'b'), is(equalTo(result)));
    }

}