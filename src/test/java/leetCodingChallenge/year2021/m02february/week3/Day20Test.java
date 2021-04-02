package leetCodingChallenge.year2021.m02february.week3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day20Test {

    private Day20 day;

    @BeforeEach
    void setUp() {
        day = new Day20();
    }

    @Test
    void testRomanToInt() {
        assertThat(day.romanToInt("III"), is(equalTo(3)));
    }

    @Test
    void testRomanToInt2() {
        assertThat(day.romanToInt("IV"), is(equalTo(4)));
    }

    @Test
    void testRomanToInt3() {
        assertThat(day.romanToInt("IX"), is(equalTo(9)));
    }

    @Test
    void testRomanToInt4() {
        //Explanation: L = 50, V= 5, III = 3
        assertThat(day.romanToInt("LVIII"), is(equalTo(58)));
    }

    @Test
    void testRomanToInt5() {
        // Explanation: M = 1000, CM = 900, XC = 90 and IV = 4
        assertThat(day.romanToInt("MCMXCIV"), is(equalTo(1994)));
    }

}