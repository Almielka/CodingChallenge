package leetCodingChallenge.year2021.march.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day23Test {

    private Day23 day;

    @BeforeEach
    void setUp() {
        day = new Day23();
    }

    @Test
    void testThreeSumMulti() {
        // Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
        // Output: 20
        // Explanation:
        // Enumerating by the values (arr[i], arr[j], arr[k]):
        // (1, 2, 5) occurs 8 times;
        // (1, 3, 4) occurs 8 times;
        // (2, 2, 4) occurs 2 times;
        // (2, 3, 3) occurs 2 times.
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        assertThat(day.threeSumMulti(arr, 8), is(equalTo(20)));
    }

    @Test
    void testThreeSumMulti2() {
        // Input: arr = [1,1,2,2,2,2], target = 5
        // Output: 12
        // Explanation:
        // arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
        // We choose one 1 from [1,1] in 2 ways,
        // and two 2s from [2,2,2,2] in 6 ways.
        int[] arr = {1, 1, 2, 2, 2, 2};
        assertThat(day.threeSumMulti(arr, 5), is(equalTo(12)));
    }

}