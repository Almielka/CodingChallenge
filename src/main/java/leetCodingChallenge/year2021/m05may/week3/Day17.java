package leetCodingChallenge.year2021.m05may.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 17.05.2021
 */

public class Day17 {

    /**
     * Given a list of words, each word consists of English lowercase letters.
     * Let's say word1 is a predecessor of word2 if and only
     * if we can add exactly one letter anywhere in word1 to make it equal to word2.
     * For example, "abc" is a predecessor of "abac".
     * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1,
     * where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.
     * Return the longest possible length of a word chain with words chosen from the given list of words.
     *
     * @param words an array of strings
     * @return the longest possible length of a word chain
     */
    // Runtime: 37 ms
    // Memory Usage: 39.4 MB
    public int longestStrChain(String[] words) {
        int count = 0;
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word : words) {
            if (dp.containsKey(word)) continue;
            int best = 0;
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            count = Math.max(count, best);
        }
        return count;
    }

}
