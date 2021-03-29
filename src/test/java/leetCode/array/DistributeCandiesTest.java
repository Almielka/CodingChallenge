package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class DistributeCandiesTest {

    private DistributeCandies day;

    @BeforeEach
    void setUp() {
        day = new DistributeCandies();
    }

    @Test
    void testDistributeCandies() {
        // Input: candyType = [1,1,2,2,3,3]
        // Output: 3
        // Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
        int[] candyType = {1, 1, 2, 2, 3, 3};
        assertThat(day.distributeCandies(candyType), is(equalTo(3)));
        assertThat(day.distributeCandies2(candyType), is(equalTo(3)));
        assertThat(day.distributeCandies3(candyType), is(equalTo(3)));
    }

    @Test
    void testDistributeCandies2() {
        // Input: candyType = [1,1,2,3]
        // Output: 2
        // Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
        int[] candyType = {1, 1, 2, 3};
        assertThat(day.distributeCandies(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies2(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies3(candyType), is(equalTo(2)));
    }

    @Test
    void testDistributeCandies3() {
        // Input: candyType = [6,6,6,6]
        // Output: 1
        // Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
        int[] candyType = {6, 6, 6, 6};
        assertThat(day.distributeCandies(candyType), is(equalTo(1)));
        assertThat(day.distributeCandies2(candyType), is(equalTo(1)));
        assertThat(day.distributeCandies3(candyType), is(equalTo(1)));
    }

    @Test
    void testDistributeCandies4() {
        int[] candyType = {0, 0, 0, 4};
        assertThat(day.distributeCandies(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies2(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies3(candyType), is(equalTo(2)));
    }


    @Test
    void testDistributeCandies5() {
        int[] candyType = {100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0};
        assertThat(day.distributeCandies(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies2(candyType), is(equalTo(2)));
        assertThat(day.distributeCandies3(candyType), is(equalTo(2)));
    }

}