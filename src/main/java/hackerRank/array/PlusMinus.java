package hackerRank.array;

/**
 * @author Anna S. Almielka
 */

public class PlusMinus {

    /**
     * Given an array of integers, calculate the ratios of its elements that are positive,
     * negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
     * <p>
     * Note: This challenge introduces precision problems.
     * The test cases are scaled to six decimal places, though answers with absolute error of up to 10^-4 are acceptable.
     * <p>
     * Print the ratios of positive, negative and zero values in the array.
     * Each value should be printed on a separate line with  digits after the decimal.
     * The function should not return a value.
     *
     * @param arr an array of integers
     * @return an array od double with
     * proportion of positive values
     * proportion of negative values
     * proportion of zeros
     * with 6 places after the decimal
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void plusMinus(int[] arr) {
        double[] result = new double[3];
        for (int i : arr) {
            if (i > 0) {
                result[0]++;
            } else if (i < 0) {
                result[1]++;
            } else result[2]++;
        }
        for (double v : result) {
            System.out.printf("%." + 6 + "f\n", v / arr.length);
        }
    }

}