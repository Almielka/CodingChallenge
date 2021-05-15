package leetCodingChallenge.year2021.m05may.week1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 01.05.2021
 */

public class Day01 {

    /**
     * Design a special dictionary which has some words and allows you
     * to search the words in it by a prefix and a suffix.
     * <p>
     * Implement the WordFilter class:
     * WordFilter(string[] words) Initializes the object with the words in the dictionary.
     * f(string prefix, string suffix) Returns the index of the word in the dictionary
     * which has the prefix prefix and the suffix suffix.
     * If there is more than one valid index, return the largest of them.
     * If there is no such word in the dictionary, return -1.
     * <p>
     * Constraints:
     * 1 <= words.length <= 15000
     * 1 <= words[i].length <= 10
     * 1 <= prefix.length, suffix.length <= 10
     * words[i], prefix and suffix consist of lower-case English letters only.
     * At most 15000 calls will be made to the function f.
     */
    // Runtime: 189 ms
    // Memory Usage: 65.5 MB
    class WordFilter {

        private Map<String, Integer> map;

        public WordFilter(String[] words) {
            map = new HashMap<>();
            getPossiblyPreSuffixes(words);
        }

        public int f(String prefix, String suffix) {
            return map.getOrDefault(prefix + "+" + suffix, -1);
        }

        private void getPossiblyPreSuffixes(String[] words) {
            for (int i = 0; i < words.length; i++) {
                for (int pre = 0; pre < words[i].length(); pre++) {
                    for (int suf = 0; suf < words[i].length(); suf++) {
                        map.put(words[i].substring(0, pre + 1) + "+" + words[i].substring(suf), i);
                    }
                }
            }
        }

    }

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */

}
