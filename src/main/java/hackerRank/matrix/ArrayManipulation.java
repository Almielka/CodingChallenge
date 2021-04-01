package hackerRank.matrix;

/**
 * @author Anna S. Almielka
 */

public class ArrayManipulation {
    /**
     * Starting with a 1-indexed array of zeros and a list of operations,
     * for each operation add a value to each of the array element between two given indices, inclusive.
     * Once all operations have been performed, return the maximum value in the array.
     * Complexity O(n+m), n – the size of the array, m – the number of operations (queries[m][])
     * <p>
     * Example:
     * n = 10
     * queries = [[1, 5, 3], [4, 8, 7], [6, 9, 1]]
     * Queries are interpreted as follows:
     * a b k
     * 1 5 3
     * 4 8 7
     * 6 9 1
     * Add the values of  between the indices  and  inclusive:
     * index->	 1 2 3  4  5 6 7 8 9 10
     * [0,0,0, 0, 0,0,0,0,0, 0]
     * [3,3,3, 3, 3,0,0,0,0, 0]
     * [3,3,3,10,10,7,7,7,0, 0]
     * [3,3,3,10,10,8,8,8,1, 0]
     * The largest value is 10 after all operations are performed.
     *
     * @param n       the number of elements in the array
     * @param queries [q][3] a two dimensional array of queries where each queries[i] contains three integers, a, b, and k
     * @return the maximum value in the resultant array
     */
    public long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 2];
        for (int[] query : queries) {
            arr[query[0]] += query[2];
            arr[query[1] + 1] -= query[2];
        }
        return getMax(arr);
    }

    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (long l : inputArray) {
            sum += l;
            max = Math.max(max, sum);
        }
        return max;
    }

}
