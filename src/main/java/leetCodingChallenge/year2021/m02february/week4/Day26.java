package leetCodingChallenge.year2021.m02february.week4;

/**
 * @author Anna S. Almielka
 * 26.02.2021
 */

public class Day26 {

    /**
     * Given two sequences pushed and popped with distinct values, return true if and only if
     * this could have been the result of a sequence of push and pop operations on an initially empty stack.
     * <p>
     * Example 1:
     * <p>
     * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
     * Output: true
     * Explanation: We might do the following sequence:
     * push(1), push(2), push(3), push(4), pop() -> 4,
     * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
     * <p>
     * Constraints:
     * <ul>
     * <li></li>0 <= pushed.length == popped.length <= 1000</li>
     * <li>0 <= pushed[i], popped[i] < 1000</li>
     * <li>pushed is a permutation of popped.</li>
     * <li>pushed and popped have distinct values.</li>
     * </ul>
     *
     * @param pushed an array integers
     * @param popped an array integers
     * @return {@code true} if this could have been the result of a sequence of push and pop
     * operations on an initially empty stack. {@code false} otherwise
     */
    // Runtime: 0 ms
    // Memory Usage: 38.5 MB
    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int i = 0, j = 0, s = 0;
        while (i < popped.length) {
            if (s >= 0 && pushed[s] == popped[j]) {
                j++;
                s--;
            } else {
                i++;
                s++;
                if (i < popped.length) pushed[s] = pushed[i];
            }
        }
        return s == 0;

    }

}
