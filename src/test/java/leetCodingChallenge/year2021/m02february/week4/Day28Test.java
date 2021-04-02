package leetCodingChallenge.year2021.m02february.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


class Day28Test {

    Day28.FreqStack freqStack;

    @BeforeEach
    void setUp() {
        freqStack = new Day28().new FreqStack();
    }

    @Test
    void testFreqStack() {
        // Input:
        // ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
        // [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
        // Output: [null,null,null,null,null,null,null,5,7,5,4]
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);

        assertThat(freqStack.pop(), is(equalTo(5)));
        assertThat(freqStack.pop(), is(equalTo(7)));
        assertThat(freqStack.pop(), is(equalTo(5)));
        assertThat(freqStack.pop(), is(equalTo(4)));
    }

    @Test
    void testFreqStack2() {
        // Input:
        // ["FreqStack","push","push","push","push","push","push","push","push","push","push","pop","pop","pop","pop","pop","pop","pop","pop","pop","pop"]
        // [[],[1],[0],[0],[1],[5],[4],[1],[5],[1],[6],[],[],[],[],[],[],[],[],[],[]]
        // Output: [null,null,null,null,null,null,null,null,null,null,null,1,1,5,1,0,6,4,5,0,1]
        freqStack.push(1);
        freqStack.push(0);
        freqStack.push(0);
        freqStack.push(1);
        freqStack.push(5);
        freqStack.push(4);
        freqStack.push(1);
        freqStack.push(5);
        freqStack.push(1);
        freqStack.push(6);

        assertThat(freqStack.pop(), is(equalTo(1)));
        assertThat(freqStack.pop(), is(equalTo(1)));
        assertThat(freqStack.pop(), is(equalTo(5)));
        assertThat(freqStack.pop(), is(equalTo(1)));
        assertThat(freqStack.pop(), is(equalTo(0)));
        assertThat(freqStack.pop(), is(equalTo(6)));
        assertThat(freqStack.pop(), is(equalTo(4)));
        assertThat(freqStack.pop(), is(equalTo(5)));
        assertThat(freqStack.pop(), is(equalTo(0)));
        assertThat(freqStack.pop(), is(equalTo(1)));
    }

}