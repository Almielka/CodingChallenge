package leetCodingChallenge.year2021.m04april.week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anna S. Almielka
 * 30.04.2021
 */

public class Day30 {

    /**
     * Given three integers x, y, and bound, return a list of all the powerful integers
     * that have a value less than or equal to bound.
     * An integer is powerful if it can be represented as x^i + y^j for some integers i >= 0 and j >= 0.
     * You may return the answer in any order. In your answer, each value should occur at most once.
     * <p>
     * Constraints:
     * 1 <= x, y <= 100
     * 0 <= bound <= 10^6
     */
    // Runtime: 1 ms
    // Memory Usage: 36.8 MB
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> result = new HashSet<>();
        for (int dx = 1; dx <= bound; dx *= x) {
            for (int dy = 1; dy + dx <= bound; dy *= y) {
                result.add(dx + dy);
                if (y == 1) break;
            }
            if (x == 1) break;
        }
        return new ArrayList<>(result);
    }

}
