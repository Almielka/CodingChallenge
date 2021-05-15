package leetCodingChallenge.year2021.m05may.week1;

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
    void testScheduleCourse() {
        // Input: courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]
        // Output: 3
        // Explanation:
        // There are totally 4 courses, but you can take 3 courses at most:
        // First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
        // Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day.
        // Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day.
        // The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        assertThat(day.scheduleCourse(courses), is(equalTo(3)));
    }

    @Test
    void testScheduleCourse2() {
        int[][] obstacleGrid = {{1, 2}};
        assertThat(day.scheduleCourse(obstacleGrid), is(equalTo(1)));
    }

    @Test
    void testScheduleCourse3() {
        int[][] obstacleGrid = {{3, 2}, {4, 3}};
        assertThat(day.scheduleCourse(obstacleGrid), is(equalTo(0)));
    }

}