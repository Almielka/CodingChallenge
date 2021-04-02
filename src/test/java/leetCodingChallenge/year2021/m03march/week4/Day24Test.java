package leetCodingChallenge.year2021.m03march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day24Test {

    private Day24 day;

    @BeforeEach
    void setUp() {
        day = new Day24();
    }

    @Test
    void testAdvantageCount() {
        int[] A = {2, 7, 11, 15};
        int[] B = {1, 10, 4, 11};
        int[] result = {2, 11, 7, 15};
        assertThat(day.advantageCount(A, B), is(equalTo(result)));
    }

    @Test
    void testAdvantageCount2() {
        int[] A = {12, 24, 8, 32};
        int[] B = {13, 25, 32, 11};
        int[] result = {24, 32, 8, 12};
        assertThat(day.advantageCount(A, B), is(equalTo(result)));
    }


    @Test
    void testAdvantageCount3() {
        int[] A = {2, 0, 4, 1, 2};
        int[] B = {1, 3, 0, 0, 2};
        int[] result = {2, 4, 1, 2, 0};
        assertThat(day.advantageCount(A, B), is(equalTo(result)));
    }

}