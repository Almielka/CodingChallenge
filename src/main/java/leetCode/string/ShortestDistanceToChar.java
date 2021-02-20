package leetCode.string;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class ShortestDistanceToChar {

    /**
     * 821.Shortest Distance to a Character
     * Given a string s and a character c that occurs in s, return an array of integers answer
     * where answer.length == s.length and answer[i] is the shortest distance from s[i] to the character c in s.
     *
     * @param s a string
     * @param c a character c that occurs in s
     * @return an array of integers
     */
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
        Arrays.fill(result, length);

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == c) {
                for (int j = 0; j < length; j++) {
                    int distance = Math.abs(i - j);
                    if (distance < result[j]) {
                        result[j] = distance;
                    }
                }
            }
        }
        return result;

    }

}
