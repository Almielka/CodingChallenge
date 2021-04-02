package leetCodingChallenge.year2021.m02february.week4;

import java.util.Stack;

/**
 * @author Anna S. Almielka
 * 24.02.2021
 */

public class Day24 {

    /**
     * Given a balanced parentheses string S, compute the score of the string based on the following rule:
     * <p>
     * () has score 1
     * AB has score A + B, where A and B are balanced parentheses strings.
     * (A) has score 2 * A, where A is a balanced parentheses string.
     *
     * @param s a balanced parentheses string
     * @return the score of the {@code s} on the following rule
     */
    // Runtime: 0 ms
    // Memory Usage: 37 MB
    public int scoreOfParentheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char c : chars) {
            if (c == '(') {
                stack.push(0);
            } else {
                stack.push(calculate(stack));
            }
        }
        return stack.pop();
    }

    private int calculate(Stack<Integer> stack) {
        int value = stack.pop();
        int tmp = stack.pop();
        return tmp + Math.max(2 * value, 1);
    }

}
