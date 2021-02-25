package leetCode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater day;

    @BeforeEach
    void setUp() {
        day = new ContainerWithMostWater();
    }

    @Test
    void testMaxArea() {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertThat(day.maxArea(arr), is(equalTo(49)));
    }

    @Test
    void testMaxArea2() {
        int[] arr = {1, 1};
        assertThat(day.maxArea(arr), is(equalTo(1)));
    }

    @Test
    void testMaxArea3() {
        int[] arr = {4, 3, 2, 1, 4};
        assertThat(day.maxArea(arr), is(equalTo(16)));
    }

    @Test
    void testMaxArea4() {
        int[] arr = {1, 2, 1};
        assertThat(day.maxArea(arr), is(equalTo(2)));
    }

    @Test
    void testMaxArea5() {
        int[] arr = {3, 9, 3, 4, 7, 2, 12, 6};
        assertThat(day.maxArea(arr), is(equalTo(45)));
    }

    @Test
    void testMaxArea6() {
        int[] arr = {1, 3, 2, 5, 25, 24, 5};
        assertThat(day.maxArea(arr), is(equalTo(24)));
    }

}