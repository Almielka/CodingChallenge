package leetCode.string;

import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class LongestWordDictionary {

    /**
     * 594.Longest Word in Dictionary through Deleting
     *
     * Given a string and a string dictionary, find the longest string in the dictionary
     * that can be formed by deleting some characters of the given string.
     * If there are more than one possible results, return the longest word with the smallest lexicographical order.
     * If there is no possible result, return the empty string.
     * <p>
     * Note:
     * All the strings in the input will only contain lower-case letters.
     * The size of the dictionary won't exceed 1,000.
     * The length of all the strings in the input won't exceed 1,000.
     *
     * @param s a string
     * @param d a string dictionary
     * @return the longest string in the dictionary
     */
    // Runtime: 18 ms
    // Memory Usage: 39.6 MB
    // Time complexity: O(n)
    // Space complexity: O(n)
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String variant : d) {
            if (result.length() > variant.length() || result.length() == variant.length() && result.compareTo(variant) < 0)
                continue;
            if (isVariant(variant, s)) result = variant;
        }
        return result;
    }

    private boolean isVariant(String variant, String s) {
        int i = 0;
        int j = 0;
        while (i < variant.length() && j < s.length()) {
            if (variant.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == variant.length();
    }

}
