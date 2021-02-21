package leetCode.different;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class PeekingIteratorTest {

    @Test
    void testPeekingIterator() {
        int[] arr = new int[]{1, 2, 3};
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);

        assertThat(peekingIterator.next(), is(equalTo(1)));
        assertThat(peekingIterator.peek(), is(equalTo(2)));
        assertThat(peekingIterator.next(), is(equalTo(2)));
        assertThat(peekingIterator.next(), is(equalTo(3)));
        assertThat(peekingIterator.hasNext(), is(equalTo(false)));
    }

}