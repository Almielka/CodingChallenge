package leetCodingChallenge.year2021.m04april.week2;

import java.util.HashMap;
import java.util.Map;

public class Day09 {

    /**
     * In an alien language, surprisingly they also use english lowercase letters,
     * but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
     * <p>
     * Given a sequence of words written in the alien language, and the order of the alphabet,
     * return true if and only if the given words are sorted lexicographicaly in this alien language.
     * <p>
     * Constraints:
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 20
     * order.length == 26
     * All characters in words[i] and order are English lowercase letters.
     *
     * @param words an array of strings
     * @param order a string represents the order
     * @return {@code true} if and only if the given {@code words} are sorted lexicographicaly
     * in this alien language, otherwise {@code false}
     */
    // Runtime: 1 ms
    // Memory Usage: 38.9 MB
    // Time Complexity: O(n * m + o) n = words.length, m is the average length of each word, o = order.length()
    // Space Complexity: O(1)
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            for (int j = 0; j < s1.length(); j++) {
                if (j == s2.length()) return false;
                if (alphabet.get(s1.charAt(j)) < alphabet.get(s2.charAt(j))) break;
                if (alphabet.get(s1.charAt(j)) > alphabet.get(s2.charAt(j))) return false;
            }
        }
        return true;
    }

}
