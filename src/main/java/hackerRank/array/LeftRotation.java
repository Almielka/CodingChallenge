package hackerRank.array;

/**
 * @author Anna S. Almielka
 */

public class LeftRotation {

    /**
     * Given an array of integers and a number d, perform d left rotations on the array.
     * Return the updated array to be printed as a single line of space-separated integers.
     *
     * @param a an array of integers
     * @param d an integer
     * @return updated array after {@code d} left rotations
     */
    public int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int tmp = a.length - d + i;
            int index = tmp < a.length ? tmp : i - d; // or int index = (i + a.length - d) % a.length;
            result[index] = a[i];
        }
        return result;
    }

}
