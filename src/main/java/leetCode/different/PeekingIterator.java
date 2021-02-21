package leetCode.different;

import java.util.Iterator;

/**
 * @author Anna S. Almielka
 */

public class PeekingIterator implements Iterator<Integer> {

    /**
     * 284.Peeking Iterator
     *
     * Given an Iterator class interface with methods: next() and hasNext(),
     * design and implement a PeekingIterator that support the peek() operation -- it essentially peek()
     * at the element that will be returned by the next call to next().
     * <p>
     * Example:
     * <p>
     * Assume that the iterator is initialized to the beginning of the list: [1,2,3].
     * <p>
     * Call next() gets you 1, the first element in the list.
     * Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.
     * You call next() the final time and it returns 3, the last element.
     * Calling hasNext() after that should return false.
     */
    //Runtime: 4 ms
    //Memory Usage: 38.9 MB
    private final Iterator iterator;
    private boolean hasPicked;
    private Integer pickedInteger;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!hasPicked) {
            pickedInteger = (Integer) iterator.next();
            hasPicked = true;
        }
        return pickedInteger;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (!hasPicked) {
            return (Integer) iterator.next();
        }
        Integer result = pickedInteger;
        hasPicked = false;
        pickedInteger = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return hasPicked || iterator.hasNext();
    }
}

