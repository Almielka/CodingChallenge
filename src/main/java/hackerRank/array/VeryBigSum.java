package hackerRank.array;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class VeryBigSum {

    /**
     * In this challenge, you are required to calculate and print the sum of the elements in an array,
     * keeping in mind that some of those integers may be quite large.
     *
     * @param ar an array of integers
     * @return long: the sum of all array elements
     */
    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

}
