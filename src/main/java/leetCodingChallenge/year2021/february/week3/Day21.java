package leetCodingChallenge.year2021.february.week3;

/**
 * @author Anna S. Almielka
 * 21.02.2021
 */

public class Day21 {

    /**
     * On a broken calculator that has a number showing on its display, we can perform two operations:
     * <p>
     * Double: Multiply the number on the display by 2, or;
     * Decrement: Subtract 1 from the number on the display.
     * Initially, the calculator is displaying the number X.
     * <p>
     * Return the minimum number of operations needed to display the number Y.
     *
     * @param X a non-negative integer 1 <= X <= 10^9
     * @param Y a non-negative integer 1 <= Y <= 10^9
     * @return the minimum number of operations to display the number {@code Y}
     */
    // Runtime: 0 ms
    // Memory Usage: 35.8 MB
    public int brokenCalc(int X, int Y) {

        if (X >= Y) return X - Y;
        if (Y % 2 == 0) {
            return brokenCalc(X, Y / 2) + 1;
        } else  {
            return brokenCalc(X, Y + 1) + 1;
        }

    }

}

