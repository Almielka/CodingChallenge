package leetCodingChallenge.year2021.m03march.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 26.03.2021
 */

public class Day26 {

    /**
     * We are given two arrays A and B of words.  Each word is a string of lowercase letters.
     * <p>
     * Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.
     * For example, "wrr" is a subset of "warrior", but is not a subset of "world".
     * Now say a word a from A is universal if for every b in B, b is a subset of a.
     * Return a list of all universal words in A.  You can return the words in any order.
     * <p>
     * Note:
     * 1 <= A.length, B.length <= 10000
     * 1 <= A[i].length, B[i].length <= 10
     * A[i] and B[i] consist only of lowercase letters.
     * All words in A[i] are unique: there isn't i != j with A[i] == A[j].
     *
     * @param A an array of strings
     * @param B an array of strings
     * @return a list of all universal words in A
     */
    private static final int ALPHABET = 26;

    // Runtime: 17 ms
    // Memory Usage: 47.7 MB
    // Time complexity: O(m + n)
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] arr = new int[ALPHABET];
        for (String b : B) {
            int[] tmp = new int[ALPHABET];
            for (char c : b.toCharArray()) {
                tmp[c - 'a']++;
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.max(arr[i], tmp[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String a : A) {
            if (isUniversal(a, arr)) {
                result.add(a);
            }
        }
        return result;
    }

    boolean isUniversal(String s, int[] arr) {
        int[] tmp = new int[ALPHABET];
        for (char c : s.toCharArray()) {
            tmp[c - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (tmp[i] < arr[i]) return false;
        }
        return true;
    }

}
