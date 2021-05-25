package leetCodingChallenge.year2021.m05may.week4;

import java.util.Stack;

/**
 * @author Anna S. Almielka
 * 25.05.2021
 */

public class Day25 {

    /**
     * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
     * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
     * <p>
     * Note that division between two integers should truncate toward zero.
     * It is guaranteed that the given RPN expression is always valid.
     * That means the expression would always evaluate to a result, and there will not be any division by zero operation.
     * <p>
     * Constraints:
     * 1 <= tokens.length <= 10^4
     * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
     *
     * @param tokens an array of strings
     * @return the integer value
     */
    // Runtime: 4 ms
    // Memory Usage: 38.9 MB
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int evalRPN(String[] tokens) {
        Stack<Integer> value = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                value.push(calculate(value.pop(), token, value.pop()));
            } else {
                value.push(Integer.parseInt(token));
            }
        }
        return value.pop();
    }

    private int calculate(int second, String sign, int first) {
        return switch (sign) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> throw new IllegalStateException("Unexpected sign: " + sign);
        };
    }

}
