package hackerRank.graph;

import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class DiagonalDifference {

    /**
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     *
     * @param arr List of List of Integers
     * @return the absolute diagonal difference
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int diagonalDifference(List<List<Integer>> arr) {
        int a = 0;
        int b = 0;
        int i = 0;
        for (List<Integer> list : arr) {
            a += list.get(i);
            b += list.get(list.size() - i - 1);
            i++;
        }
        return Math.abs(a - b);
    }

}
