package leetCodingChallenge.year2021.m04april.week2;

import java.util.*;

public class Day13 {

    /**
     * You are given a nested list of integers nestedList.
     * Each element is either an integer or a list whose elements may also be integers or other lists.
     * Implement an iterator to flatten it.
     * <p>
     * Implement the NestedIterator class:
     * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
     * int next() Returns the next integer in the nested list.
     * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
     * <p>
     * Constraints:
     * 1 <= nestedList.length <= 500
     * The values of the integers in the nested list is in the range [-10^6, 10^6].
     */
    // Runtime: 2 ms
    // Memory Usage: 41.4 MB
    public class NestedIterator implements Iterator<Integer> {

        private Queue<Integer> queue;

        /**
         * Initializes the iterator with the nested list nestedList.
         */
        public NestedIterator(List<NestedInteger> nestedList) {
            queue = new LinkedList<>();
            fillQueue(nestedList);
        }

        // using recursion for searching all nested integers
        private void fillQueue(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    queue.add(nestedInteger.getInteger());
                } else {
                    fillQueue(nestedInteger.getList());
                }
            }
        }

        /**
         * @return the next integer in the nested list
         */
        @Override
        public Integer next() {
            return queue.poll();
        }

        /**
         * @return {@code true} if there are still some integers in the nested list and {@code false} otherwise
         */
        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

    }

    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     */
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }


/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

}
