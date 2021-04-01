package hackerRank.array;

import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class SubarrayDivision {

    /**
     * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
     * Lily decides to share a contiguous segment of the bar selected such that:
     * The length of the segment matches Ron's birth month, and,
     * The sum of the integers on the squares is equal to his birth day.
     * Determine how many ways she can divide the chocolate.
     * <p>
     * Constraints:
     * 1 <= n <= 100
     * 1 <= s[i] <= 5
     * 1 <= d <= 31
     * 1 <= m <= 12
     *
     * @param s the numbers on each of the squares of chocolate
     * @param d Ron's birth day
     * @param m Ron's birth month
     * @return the number of ways the bar can be divided
     */
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

}
