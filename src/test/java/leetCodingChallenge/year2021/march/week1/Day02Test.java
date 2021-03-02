package leetCodingChallenge.year2021.march.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day02Test {

    private Day02 day;

    @BeforeEach
    void setUp() {
        day = new Day02();
    }

    @Test
    void testFindErrorNums() {
        int[] input = {1, 2, 2, 4};
        int[] output = {2, 3};
        assertThat(day.findErrorNums(input), is(equalTo(output)));
    }

    @Test
    void testFindErrorNums2() {
        int[] input = {1, 1};
        int[] output = {1, 2};
        assertThat(day.findErrorNums(input), is(equalTo(output)));
    }

}