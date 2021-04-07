package leetCodingChallenge.year2021.m04april.week1;

/**
 * @author Anna S. Almielka
 * 07.04.2021
 */

public class Day07 {

    /**
     * You are given a string s of even length.
     * Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
     * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
     * Notice that s contains uppercase and lowercase letters.
     * Return true if a and b are alike. Otherwise, return false.
     * <p>
     * Constraints:
     * 2 <= s.length <= 1000
     * s.length is even.
     * s consists of uppercase and lowercase letters.
     *
     * @param s a string of even length
     * @return {@code true} if the first and the second halves of the {@code s}
     * has the same number of vowels, otherwise {@code false}
     */

    // Runtime: 4 ms
    // Memory Usage: 39.1 MB
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean halvesAreAlike(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (isVowel(c)) {
                if (i < s.length() / 2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count == 0;
    }

    private boolean isVowel(char c) {
        String s = String.valueOf(c).toLowerCase();
        c = s.charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Runtime: 2 ms
    // Memory Usage: 37.1 MB
    // Time Complexity: O(n/2)
    // Space Complexity: O(1)
    public boolean halvesAreAlike2(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        int half = s.length() / 2;
        for (int i = 0, j = half; i < half; i++, j++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) count++;
            if (vowels.indexOf(s.charAt(j)) >= 0) count--;
        }
        return count == 0;
    }

}
