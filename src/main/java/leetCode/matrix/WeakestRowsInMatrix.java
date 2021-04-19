package leetCode.matrix;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class WeakestRowsInMatrix {

    /**
     * 1337.The K Weakest Rows in a Matrix
     *
     * Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians),
     * return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
     * <p>
     * A row i is weaker than row j, if the number of soldiers in row i is less than
     * the number of soldiers in row j, or they have the same number of soldiers but i is less than j.
     * Soldiers are always stand in the frontier of a row, that is, always ones may appear first and then zeros.
     *
     * @param mat a m * n matrix, where m, n are integers
     * @param k an integer
     * @return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest
     */
    // Runtime: 2 ms
    // Memory Usage: 40 MB
    // Time Complexity: O(n * m) where n = mat.length, m = mat[0].length
    // Space Complexity: O(n)
    public int[] kWeakestRows(int[][] mat, int k) {

        int[] values = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    values[i] = ++count;
                } else break;
            }
        }

        int[] copy = new int[mat.length];
        System.arraycopy(values, 0, copy, 0, values.length);
        Arrays.sort(copy);
        int[] result = new int[k];
        System.arraycopy(copy, 0, result, 0, result.length);
        boolean[] checked = new boolean[mat.length];
        for (int i = 0; i < k; i++) {
            int value = result[i];
            for (int j = 0; j < values.length; j++) {
                if (checked[j]) continue;
                if (values[j] == value) {
                    result[i] = j;
                    checked[j] = true;
                    break;
                }
            }
        }
        return result;
    }

}

