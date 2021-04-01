package hackerRank.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anna S. Almielka
 */

public class StockPair {

    /**
     * Given the array of profits, find the number of distinct pairs of stock
     * where sum of each pair's profits is exactly equal to the target profit
     * @param stocksProfit an array of integers
     * @param target a long
     * @return sum of distinct pairs where their sum equal {@code target}
     */
    // Time Complexity: O(n)
    public static int stockPairs(List<Integer> stocksProfit, long target) {
        Map<Long, Integer> map = new HashMap<>();
        int result = 0;
        for (Integer value : stocksProfit) {
            long key = target - value;
            if (map.containsKey(key) && map.get(key) >= 1) {
                if (!map.containsKey((long) value) || key == value) {
                    result++;
                    map.put(key, map.get(key) - 1);
                }
            } else {
                map.merge((long) value, 1, Integer::sum);
            }
        }
        return result;
    }

}
