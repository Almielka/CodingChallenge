package leetCodingChallenge.year2021.february.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day25Test {

    private Day25 day;

    @BeforeEach
    void setUp() {
        day = new Day25();
    }

    @Test
    void testFindUnsortedSubarray() {
        // Input: nums = [2,6,4,8,10,9,15]
        // Output: 5
        // Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
        int[] arr = {2, 6, 4, 8, 10, 9, 15};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(5)));
    }

    @Test
    void testFindUnsortedSubarray2() {
        int[] arr = {1, 2, 3, 4};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(0)));
    }

    @Test
    void testFindUnsortedSubarray3() {
        int[] arr = {1};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(0)));
    }

    @Test
    void testFindUnsortedSubarray4() {
        int[] arr = {2, 1};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(2)));
    }

    @Test
    void testFindUnsortedSubarray5() {
        int[] arr = {5, 4, 3, 2, 1};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(5)));
    }

    @Test
    void testFindUnsortedSubarray6() {
        int[] arr = {1, 3, 2, 2, 2};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(4)));
    }

    @Test
    void testFindUnsortedSubarray7() {
        int[] arr = {3, 2, 3, 2, 4};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(4)));
    }

    @Test
    void testFindUnsortedSubarray8() {
        int[] arr = {1, 2, 4, 3, 5};
        assertThat(day.findUnsortedSubarray(arr), is(equalTo(2)));
    }

}