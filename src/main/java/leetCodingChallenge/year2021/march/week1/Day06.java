package leetCodingChallenge.year2021.march.week1;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 06.03.2021
 */

public class Day06 {

    /**
     * A valid encoding of an array of words is any reference string s and array of indices indices such that:
     * <p>
     * words.length == indices.length
     * The reference string s ends with the '#' character.
     * For each index indices[i], the substring of s starting from indices[i] and
     * up to (but not including) the next '#' character is equal to words[i].
     * <p>
     * Given an array of words, return the length of the shortest reference string s
     * possible of any valid encoding of words.
     * <p>
     * Constraints:
     * 1 <= words.length <= 2000
     * 1 <= words[i].length <= 7
     * words[i] consists of only lowercase letters.
     *
     * @param words an array of strings
     * @return the length of the shortest reference string
     */
    // Runtime: 287 ms
    // Memory Usage: 39.2 MB
    public int minimumLengthEncoding(String[] words) {
        if (words.length == 1) return words[0].length() + 1;
        StringBuilder str = new StringBuilder();
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        for (String word : words) {
            if (str.indexOf(word + "#") == -1) {
                str.append(word).append("#");
            }
        }
        return str.length();
    }

}
