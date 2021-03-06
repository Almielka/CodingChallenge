package leetCode.string;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class ValidAnagram {

    /**
     * 242.Valid Anagram
     *
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     *
     * @param s a string
     * @param t a string
     * @return {@code true} if {@code t} is an anagram of {@code s},
     *         {@code false} otherwise
     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }

}
