package leetCodingChallenge.year2021.m04april.week4;

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
    void testFurthestBuilding() {
        // Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
        // Output: 4
        // Explanation: Starting at building 0, you can follow these steps:
        // - Go to building 1 without using ladders nor bricks since 4 >= 2.
        // - Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
        // - Go to building 3 without using ladders nor bricks since 7 >= 6.
        // - Go to building 4 using your only ladder. You must use either bricks or ladders because 6 < 9.
        // It is impossible to go beyond building 4 because you do not have any more bricks or ladders.
        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        assertThat(day.furthestBuilding(heights, 5, 1), is(equalTo(4)));
    }

    @Test
    void testFurthestBuilding2() {
        // Input: heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
        // Output: 7
        int[] heights = {4, 12, 2, 7, 3, 18, 20, 3, 19};
        assertThat(day.furthestBuilding(heights, 10, 2), is(equalTo(7)));
    }


    @Test
    void testFurthestBuilding3() {
        // Input: heights = [14,3,19,3], bricks = 17, ladders = 0
        // Output: 3
        int[] heights = {14, 3, 19, 3};
        assertThat(day.furthestBuilding(heights, 17, 0), is(equalTo(3)));
    }

}