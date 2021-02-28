package leetCodingChallenge.year2021.february.week4;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 28.02.2021
 */

public class Day28 {

    /**
     * Your FreqStack object will be instantiated and called as such:
     * FreqStack obj = new FreqStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * Implement FreqStack, a class which simulates the operation of a stack-like data structure.
     * <p>
     * FreqStack has two functions:
     * <p>
     * push(int x), which pushes an integer x onto the stack.
     * pop(), which removes and returns the most frequent element in the stack.
     * If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
     * <p>
     * Note:
     * <ul>
     * <li>Calls to FreqStack.push(int x) will be such that 0 <= x <= 10^9.</li>
     * <li>It is guaranteed that FreqStack.pop() won't be called if the stack has zero elements.</li>
     * <li>The total number of FreqStack.push calls will not exceed 10000 in a single test case.</li>
     * <li>The total number of FreqStack.pop calls will not exceed 10000 in a single test case.</li>
     * vThe total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.</li>
     * </ul>
     */
    // Runtime: 26 ms
    // Memory Usage: 49.1 MB
    // Time complexity: O(1)
    class FreqStack {

        private Map<Integer, Integer> frequents;
        private Map<Integer, List<Integer>> elements;
        private int mostFrequent;

        public FreqStack() {
            frequents = new HashMap<>();
            elements = new HashMap<>();
        }

        public void push(int x) {
            Integer tmp = frequents.get(x);
            // put number and its most frequent
            frequents.put(x, tmp == null ? 1 : tmp + 1);
            int frequent = frequents.get(x);
            mostFrequent = Math.max(mostFrequent, frequent);
            List<Integer> values = elements.getOrDefault(frequent, new ArrayList<>());
            values.add(x);
            // put frequent and its numbers
            elements.put(frequent, values);
        }

        public int pop() {
            // get the most frequent numbers
            List<Integer> values = elements.get(mostFrequent);
            int value = values.remove(values.size() - 1);
            if (values.isEmpty()) {
                // if the last, remove List and reduce mostFrequent
                elements.remove(mostFrequent);
                mostFrequent--;
            }
            // reduce frequent for this value in the frequents map
            frequents.put(value, frequents.get(value) - 1);
            return value;
        }

    }

}
