package leetCodingChallenge.year2021.m05may.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 21.05.2021
 */

public class Day21 {

    /**
     * Given a list of strings words and a string pattern,
     * return a list of words[i] that match pattern. You may return the answer in any order.
     * <p>
     * A word matches the pattern if there exists a permutation of letters p
     * so that after replacing every letter x in the pattern with p(x), we get the desired word.
     * Recall that a permutation of letters is a bijection from letters to letters:
     * every letter maps to another letter, and no two letters map to the same letter.
     * <p>
     * Constraints:
     * 1 <= pattern.length <= 20
     * 1 <= words.length <= 50
     * words[i].length == pattern.length
     * pattern and words[i] are lowercase English letters.
     *
     * @param words   a list of strings
     * @param pattern a string
     * @return return a list of words[i] that match pattern.
     */
    // Runtime: 1 ms
    // Memory Usage: 38.9 MB
    // Time Complexity : O(nm) where n = words.length(), m = word.length()
    // Space Complexity: O(nm)
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> mapW = new HashMap<>();
        Map<Character, Character> mapP = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            mapW.putIfAbsent(w, p);
            mapP.putIfAbsent(p, w);
            if (mapW.get(w) != p || mapP.get(p) != w) return false;
        }
        return true;
    }

}
