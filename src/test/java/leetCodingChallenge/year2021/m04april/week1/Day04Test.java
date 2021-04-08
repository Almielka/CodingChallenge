package leetCodingChallenge.year2021.m04april.week1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class Day04Test {

    Day04.MyCircularQueue myCircularQueue;

    @Test
    void testMyCircularQueue() {
        // Input
        // ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
        // [[3], [1], [2], [3], [4], [], [], [], [4], []]
        // Output
        // [null, true, true, true, false, 3, true, true, true, 4]
        //
        // Explanation
        // MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        // myCircularQueue.enQueue(1); // return True
        // myCircularQueue.enQueue(2); // return True
        // myCircularQueue.enQueue(3); // return True
        // myCircularQueue.enQueue(4); // return False
        // myCircularQueue.Rear();     // return 3
        // myCircularQueue.isFull();   // return True
        // myCircularQueue.deQueue();  // return True
        // myCircularQueue.enQueue(4); // return True
        // myCircularQueue.Rear();     // return 4
        myCircularQueue = new Day04().new MyCircularQueue(3);
        assertThat(myCircularQueue.enQueue(1), is(equalTo(true)));
        assertThat(myCircularQueue.enQueue(2), is(equalTo(true)));
        assertThat(myCircularQueue.enQueue(3), is(equalTo(true)));
        assertThat(myCircularQueue.enQueue(4), is(equalTo(false)));
        assertThat(myCircularQueue.Rear(), is(equalTo(3)));
        assertThat(myCircularQueue.isFull(), is(equalTo(true)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(true)));
        assertThat(myCircularQueue.enQueue(4), is(equalTo(true)));
        assertThat(myCircularQueue.Rear(), is(equalTo(4)));
    }

    @Test
    void testMyCircularQueue2() {
        // Input
        // ["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
        // [[6],[6],[],[],[],[5],[],[],[],[],[],[]]
        // Output:
        //[null,true,6,6,true,true,5,true,-1,false,false,false]
        myCircularQueue = new Day04().new MyCircularQueue(6);
        assertThat(myCircularQueue.enQueue(6), is(equalTo(true)));
        assertThat(myCircularQueue.Rear(), is(equalTo(6)));
        assertThat(myCircularQueue.Rear(), is(equalTo(6)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(true)));
        assertThat(myCircularQueue.enQueue(5), is(equalTo(true)));
        assertThat(myCircularQueue.Rear(), is(equalTo(5)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(true)));
        assertThat(myCircularQueue.Front(), is(equalTo(-1)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(false)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(false)));
        assertThat(myCircularQueue.deQueue(), is(equalTo(false)));
    }

}