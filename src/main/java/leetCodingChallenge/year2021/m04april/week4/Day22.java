package leetCodingChallenge.year2021.m04april.week4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anna S. Almielka
 * 22.04.2021
 */

public class Day22 {

    /**
     * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
     * The bricks have the same height but different width.
     * You want to draw a vertical line from the top to the bottom and cross the least bricks.
     * The brick wall is represented by a list of rows. Each row is a list of integers representing
     * the width of each brick in this row from left to right.
     * If your line go through the edge of a brick, then the brick is not considered as crossed.
     * You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.
     * <p>
     * You cannot draw a line just along one of the two vertical edges of the wall,
     * in which case the line will obviously cross no bricks.
     * <p>
     * Note:
     * The width sum of bricks in different rows are the same and won't exceed INT_MAX.
     * The number of bricks in each row is in range [1,10,000].
     * The height of wall is in range [1,10,000]. Total number of bricks of the wall won't exceed 20,000.
     *
     * @param wall is represented by a list of rows of bricks
     * @return the number of crossed bricks
     */
    // Runtime: 8 ms
    // Memory Usage: 42.7 MB
    // Time Complexity: O(n) where n number of all bricks
    // Space Complexity: O(m) where m number of unique widths of bricks
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int widthBricks = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                widthBricks += row.get(i);
                map.merge(widthBricks, 1, Integer::sum);
            }
        }
        int skipBricks = 0;
        for (int value : map.values()) {
            skipBricks = Math.max(skipBricks, value);
        }
        return wall.size() - skipBricks;
    }

}
