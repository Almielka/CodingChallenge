package hackerRank.array;

import java.util.Collections;
import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class BirthdayCakeCandles {

    /**
     * You are in charge of the cake for a child's birthday.
     * You have decided the cake will have one candle for each year of their total age.
     * They will only be able to blow out the tallest of the candles.
     * Count how many candles are tallest.
     *
     * Constraints:
     * 1 <= n <= 10^5
     * 1 <= candles[i] <= 10^7
     *
     * @param candles int candles[n]: the candle heights
     * @return  the number of candles that are tallest
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Collections.reverseOrder());
        int max = candles.get(0);
        int count = 0;
        for (Integer candle : candles) {
            if (candle == max) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int birthdayCakeCandles2(List<Integer> candles) {
        return Collections.frequency(candles, Collections.max(candles));
    }

}
