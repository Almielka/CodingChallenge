package hackerRank.array;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class SimpleArraySum {

    /**
     * Given an array of integers, find the sum of its elements.
     * For example, if the array 1, 2, 3 so return 6.
     *
     * @param ar an array of integers
     * @return the sum of all array elements
     */
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

}
