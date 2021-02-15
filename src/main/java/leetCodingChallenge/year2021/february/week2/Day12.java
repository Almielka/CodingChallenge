package leetCodingChallenge.year2021.february.week2;

/**
 * @author Anna S. Almielka
 * 12.02.2021
 */

public class Day12 {

    /**
     * Given a non-negative integer num, return the number of steps to reduce it to zero.
     * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     *
     * @param num a non-negative integer
     * @return the number of steps to reduce {@code num} to zero
     */
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }

        return steps;
    }

}
