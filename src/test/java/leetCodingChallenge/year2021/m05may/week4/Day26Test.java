package leetCodingChallenge.year2021.m05may.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day26Test {

    private Day26 day;

    @BeforeEach
    void setUp() {
        day = new Day26();
    }

    @Test
    void testMinPartitions() {
        // Input: n = "32"
        //Output: 3
        //Explanation: 10 + 11 + 11 = 32
        assertThat(day.minPartitions("32"), is(equalTo(3)));
    }

    @Test
    void testMinPartitions2() {
        assertThat(day.minPartitions("82734"), is(equalTo(8)));
    }

    @Test
    void testMinPartitions3() {
        assertThat(day.minPartitions("27346209830709182346"), is(equalTo(9)));
    }

}
