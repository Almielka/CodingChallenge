package leetCode.binary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class NumberOf1BitsTest {

    private NumberOf1Bits day;

    @BeforeEach
    void setUp() {
        day = new NumberOf1Bits();
    }

    @Test
    void testHammingWeight() {
        assertThat(day.hammingWeight(11), is(equalTo(3)));
    }

    @Test
    void testHammingWeight2() {
        assertThat(day.hammingWeight(128), is(equalTo(1)));
    }

    @Test
    void testHammingWeight3() {
        assertThat(day.hammingWeight(0xFFFFFFFD), is(equalTo(31)));
    }

}