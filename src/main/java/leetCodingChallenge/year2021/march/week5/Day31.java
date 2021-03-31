package leetCodingChallenge.year2021.march.week5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anna S. Almielka
 * 31.03.2021
 */

public class Day31 {

    /**
     * You want to form a target string of lowercase letters.
     * At the beginning, your sequence is target.length '?' marks.  You also have a stamp of lowercase letters.
     * On each turn, you may place the stamp over the sequence, and replace every letter
     * in the sequence with the corresponding letter from the stamp.  You can make up to 10 * target.length turns.
     * <p>
     * For example, if the initial sequence is "?????", and your stamp is "abc",
     * then you may make "abc??", "?abc?", "??abc" in the first turn.
     * (Note that the stamp must be fully contained in the boundaries of the sequence in order to stamp.)
     * <p>
     * If the sequence is possible to stamp, then return an array of the index of
     * the left-most letter being stamped at each turn.
     * If the sequence is not possible to stamp, return an empty array.
     * <p>
     * For example, if the sequence is "ababc", and the stamp is "abc",
     * then we could return the answer [0, 2], corresponding to the moves "?????" -> "abc??" -> "ababc".
     * <p>
     * Also, if the sequence is possible to stamp, it is guaranteed it is possible
     * to stamp within 10 * target.length moves.
     * Any answers specifying more than this number of moves will not be accepted.
     * <p>
     * Note:
     * 1 <= stamp.length <= target.length <= 1000
     * stamp and target only contain lowercase letters.
     *
     * @param stamp  a string contains lowercase letters
     * @param target a string contains lowercase letters
     * @return an array of the index of the left-most letter being stamped at each turn
     */
    // Runtime: 4 ms
    // Memory Usage: 39.4 MB
    // Time Complexity: O(m (n - m))
    // Space Complexity: O(n + m)
    public int[] movesToStamp(String stamp, String target) {
        if (target.equals(stamp)) return new int[]{0};
        char[] stampChars = stamp.toCharArray();
        char[] targetChars = target.toCharArray();
        int stampLength = stamp.length();
        int targetLength = target.length();
        List<Integer> list = new ArrayList<>();
        boolean isMatch;
        do {
            isMatch = false;
            for (int i = 0; i <= targetLength - stampLength; i++) {
                boolean checked = true;
                int index = 0;
                for (int j = 0; j < stampLength; j++) {
                    char current = targetChars[i + j];
                    if (current == '?') {
                        index++;
                    }
                    if (!(current == '?' || current == stampChars[j])) {
                        checked = false;
                        break;
                    }
                }
                if (checked && index < stampLength) {
                    isMatch = true;
                    list.add(0, i);
                    for (int j = 0; j < stampLength; j++) {
                        targetChars[i + j] = '?';
                    }
                }

            }
        } while (isMatch);

        for (char c : targetChars) {
            if (c != '?') return new int[0];
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
