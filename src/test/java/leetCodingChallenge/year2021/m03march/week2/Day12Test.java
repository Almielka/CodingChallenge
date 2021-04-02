package leetCodingChallenge.year2021.m03march.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

class Day12Test {

    private Day12 day;

    @BeforeEach
    void setUp(){
        day = new Day12();
    }

    @Test
    void testHasAllCodes(){
        // Input: s = "00110110", k = 2
        // Output: true
        // Explanation: The binary codes of length 2 are "00", "01", "10" and "11".
        // They can be all found as substrings at indices 0, 1, 3 and 2 respectively.
        assertThat(day.hasAllCodes("00110110", 2), is(equalTo(true)));
    }

    @Test
    void testHasAllCodes2(){
        assertThat(day.hasAllCodes("00110", 2), is(equalTo(true)));
    }

    @Test
    void testHasAllCodes3(){
        // Input: s = "0110", k = 1
        // Output: true
        // Explanation: The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring.
        assertThat(day.hasAllCodes("0110", 1), is(equalTo(true)));
    }

    @Test
    void testHasAllCodes4(){
        // Input: s = "0110", k = 2
        // Output: false
        // Explanation: The binary code "00" is of length 2 and doesn't exist in the array.
        assertThat(day.hasAllCodes("0110", 2), is(equalTo(false)));
    }

    @Test
    void testHasAllCodes5(){
        assertThat(day.hasAllCodes("0000000001011100", 4), is(equalTo(false)));
    }

    @Test
    void testHasAllCodes6(){
        assertThat(day.hasAllCodes("01001000100111101001010101110100010001011100011100100101010000001101010" +
                        "1011101001000110101101010000111111111111010000100100000010001111110011100100000010110" +
                        "1000111010001000101000111001011101101011010111011011001101000100100011000110101010101" +
                        "0111011111000010110101101100010000001001110000000000001100110111001011010100101001011" +
                        "111110010010001100011100101110111001100101001011100001110",
                7), is(equalTo(false)));
    }

    @Test
    void testHasAllCodes7(){
        assertThat(day.hasAllCodes("0101", 13), is(equalTo(false)));
    }


}