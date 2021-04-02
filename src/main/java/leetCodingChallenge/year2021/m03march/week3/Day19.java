package leetCodingChallenge.year2021.m03march.week3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 19.03.2021
 */

public class Day19 {

    /**
     * There are N rooms and you start in room 0.
     * Each room has a distinct number in 0, 1, 2, ..., N-1,
     * and each room may have some keys to access the next room.
     * <p>
     * Formally, each room i has a list of keys rooms[i],
     * and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.
     * A key rooms[i][j] = v opens the room with number v.
     * Initially, all the rooms start locked (except for room 0).
     * You can walk back and forth between rooms freely.
     * Return true if and only if you can enter every room.
     * <p>
     * Note:
     * 1 <= rooms.length <= 1000
     * 0 <= rooms[i].length <= 1000
     * The number of keys in all rooms combined is at most 3000.
     *
     * @param rooms
     * @return
     */
    // Runtime: 1 ms
    // Memory Usage: 39.1 MB
    // Time complexity: O(m + n)
    // Space complexity: O(n)
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int key = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] checked = new boolean[rooms.size()];
        queue.add(key);
        while (!queue.isEmpty()) {
            int index = queue.poll();
            if (!checked[index]) {
                queue.addAll(rooms.get(index));
                checked[index] = true;
            }
        }
        for (boolean check : checked) {
            if (!check) {
                return false;
            }
        }
        return true;
    }

}
