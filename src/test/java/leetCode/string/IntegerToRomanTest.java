package leetCode.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class IntegerToRomanTest {

    private IntegerToRoman day;

    @BeforeEach
    void setUp() {
        day = new IntegerToRoman();
    }

    @Test
    void testIntToRoman() {
        assertThat(day.intToRoman(3), is(equalTo("III")));
    }

    @Test
    void testIntToRoman2() {
        assertThat(day.intToRoman(4), is(equalTo("IV")));
    }

    @Test
    void testIntToRoman3() {
        assertThat(day.intToRoman(9), is(equalTo("IX")));
    }

    @Test
    void testIntToRoman4() {
        // Explanation: L = 50, V = 5, III = 3
        assertThat(day.intToRoman(58), is(equalTo("LVIII")));
    }

    @Test
    void testIntToRoman5() {
        // Explanation: M = 1000, CM = 900, XC = 90 and IV = 4
        assertThat(day.intToRoman(1994), is(equalTo("MCMXCIV")));
    }

    @Test
    void testIntToRoman6() {
        assertThat(day.intToRoman(3999), is(equalTo("MMMCMXCIX")));
    }

}