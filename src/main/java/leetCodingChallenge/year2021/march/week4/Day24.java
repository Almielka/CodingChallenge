package leetCodingChallenge.year2021.march.week4;

import java.util.TreeMap;

/**
 * @author Anna S. Almielka
 * 24.03.2021
 */

public class Day24 {

    /**
     * Given two arrays A and B of equal size, the advantage of A
     * with respect to B is the number of indices i for which A[i] > B[i].
     * Return any permutation of A that maximizes its advantage with respect to B.
     * Note:
     * 1 <= A.length = B.length <= 10000
     * 0 <= A[i] <= 10^9
     * 0 <= B[i] <= 10^9
     *
     * @param A an array of integers
     * @param B an array of integers
     * @return any permutation of A that maximizes its advantage with respect to B
     */
    // Runtime: 67 ms
    // Memory Usage: 42.9 MB
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int num : A) {
            map.merge(num, 1, Integer::sum);
        }
        for (int i = 0; i < A.length; i++) {
            // Returns the least key strictly greater than the given key, or null if there is no such key
            Integer key = map.higherKey(B[i]);
            if (key == null) {
                key = map.firstKey();
            }
            A[i] = key;
            remove(map, key);
        }

        return A;
    }

    void remove(TreeMap<Integer, Integer> map, int key) {
        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, map.get(key) - 1);
        }
    }

}
