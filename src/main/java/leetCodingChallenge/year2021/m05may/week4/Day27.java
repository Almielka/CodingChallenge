package leetCodingChallenge.year2021.m05may.week4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anna S. Almielka
 * 27.05.2021
 */

public class Day27 {

    /**
     * Given a string array words, return the maximum value of length(word[i]) * length(word[j])
     * where the two words do not share common letters. If no such two words exist, return 0.
     * <p>
     * Constraints:
     * 2 <= words.length <= 1000
     * 1 <= words[i].length <= 1000
     * words[i] consists only of lowercase English letters.
     *
     * @param words a string array
     * @return the maximum value of length(word[i]) * length(word[j])
     */
    // Runtime: 1945 ms
    // Memory Usage: 39.5 MB
    public int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            Set<Character> set = toSet(words[i].toCharArray());
            for (int j = i + 1; j < words.length; j++) {
                Set<Character> intersection = toSet(words[j].toCharArray());
                intersection.retainAll(set);
                if (intersection.isEmpty()) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

    private Set<Character> toSet(char[] chars) {
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        return set;
    }

    // Runtime: 6 ms
    // Memory Usage: 39.3 MB
    // Time Complexity : O(n^2 + n^2)
    // Space Complexity: O(n)
    public int maxProduct2(String[] words) {
        int[] bits = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                bits[i] = bits[i] | 1 << (words[i].charAt(j) - 'a');
            }
        }
        int max = 0;
        for (int i = 0; i < bits.length; i++) {
            for (int j = i + 1; j < bits.length; j++) {
                if ((bits[i] & bits[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

}
