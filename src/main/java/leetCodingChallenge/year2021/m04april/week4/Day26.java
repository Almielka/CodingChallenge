package leetCodingChallenge.year2021.m04april.week4;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 26.04.2021
 */

public class Day26 {

    /**
     * You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
     * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
     * While moving from building i to building i+1 (0-indexed),
     * <p>
     * If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
     * If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
     * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
     * <p>
     * Constraints:
     * 1 <= heights.length <= 10^5
     * 1 <= heights[i] <= 10^6
     * 0 <= bricks <= 10^9
     * 0 <= ladders <= heights.length
     *
     * @param heights an integer array heights representing the heights of buildings
     * @param bricks  an integer representing some bricks
     * @param ladders an integer representing some ladders
     * @return the furthest building index you can reach if you use the given ladders and bricks optimally
     */
    // Runtime: 13 ms
    // Memory Usage: 48.9 MB
    // Time Complexity: O(n) where n = matrix.length * matrix.length
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int count = heights.length - 1;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < count; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (ladders > 0) {
                    pq.add(diff);
                    ladders--;
                } else if (!pq.isEmpty() && diff > pq.peek()) {
                    pq.add(diff);
                    bricks -= pq.remove();
                } else bricks -= diff;
                if (bricks < 0) return i;
            }
        }
        return count;
    }

}
