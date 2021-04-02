package leetCodingChallenge.year2021.m02february.week1;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 * 07.02.2021
 */

public class Day07 {
    /**
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
