package leetCodingChallenge.year2021.march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day28Test {

    private Day28 day;

    @BeforeEach
    void setUp() {
        day = new Day28();
    }

    @Test
    void testOriginalDigits() {
        assertThat(day.originalDigits("owoztneoer"), is(equalTo("012")));
    }

    @Test
    void testOriginalDigits2() {
        assertThat(day.originalDigits("fviefuro"), is(equalTo("45")));
    }

    @Test
    void testOriginalDigits3() {
        assertThat(day.originalDigits("zerozero"), is(equalTo("00")));
    }

    @Test
    void testOriginalDigits4() {
        assertThat(day.originalDigits("zeroonetwothreefourfivesixseveneightnine"), is(equalTo("0123456789")));
    }

}