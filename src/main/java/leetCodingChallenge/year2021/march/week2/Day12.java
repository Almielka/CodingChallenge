package leetCodingChallenge.year2021.march.week2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anna S. Almielka
 * 12.03.2021
 */

public class Day12 {

    /**
     * Constraints:
     * 1 <= s.length <= 5 * 10^5
     * s consists of 0's and 1's only.
     * 1 <= k <= 20
     * Hint:
     * The number of distinct sub-strings should be exactly 2^k.
     *
     * @param s a binary string
     * @param k an integer
     * @return {@code true}  if every binary code of length {@code k} is a substring of {@code s},
     * {@code false} otherwise
     */
    // Runtime: 118 ms
    // Memory Usage: 52.3 MB
    public boolean hasAllCodes(String s, int k) {
        if (s.length() <= k) return false;
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
        }
        return set.size() == 1 << k;
    }

}
