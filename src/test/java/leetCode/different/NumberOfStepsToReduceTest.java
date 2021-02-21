package leetCode.different;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class NumberOfStepsToReduceTest {

    private NumberOfStepsToReduce day;

    @BeforeEach
    void setUp() {
        day = new NumberOfStepsToReduce();
    }

    @Test
    void testNumberOfSteps() {
        assertThat(day.numberOfSteps(14), is(equalTo(6)));
    }

    @Test
    void testNumberOfSteps2() {
        assertThat(day.numberOfSteps(8), is(equalTo(4)));
    }

    @Test
    void testNumberOfSteps3() {
        assertThat(day.numberOfSteps(123), is(equalTo(12)));
    }

}