package leetCodingChallenge.year2021.february.week2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 13.02.2021
 */

public class Day13 {

    /**
     * In an N by N square grid, each cell is either empty (0) or blocked (1).
     * <p>
     * A clear path from top-left to bottom-right has length k if and only if it is composed of cells C_1, C_2, ..., C_k such that:
     * <p>
     * Adjacent cells C_i and C_{i+1} are connected 8-directionally (ie., they are different and share an edge or corner)
     * C_1 is at location (0, 0) (ie. has value grid[0][0])
     * C_k is at location (N-1, N-1) (ie. has value grid[N-1][N-1])
     * If C_i is located at (r, c), then grid[r][c] is empty (ie. grid[r][c] == 0).
     * Return the length of the shortest such clear path from top-left to bottom-right.  If such a path does not exist, return -1.
     *
     * @param grid an N by N square grid, where N is an integer
     * @return the length of the shortest such clear path from top-left to bottom-right,
     * if such a path does not exist, return -1
     */
    // Runtime: 12 ms
    // Memory Usage: 39.9 MB
    private int path = 1;
    private int[][] grid;

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || !(grid[0][0] == 0 && grid[grid.length - 1][grid[0].length - 1] == 0)) {
            return -1;
        }
        this.grid = grid;

        boolean[][] checked = new boolean[grid.length][grid.length]; //for checked cells
        Cell cellStart = new Cell(0, 0);
        checked[0][0] = true;

        Queue<Cell> list = new LinkedList<>();
        list.add(cellStart);

        while (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Cell tmpCell = list.remove(); //remove and get the head
                int y = tmpCell.y;
                int x = tmpCell.x;
                if (y == grid.length - 1 && x == grid[0].length - 1) return path; //when cell is Finish
                for (int dy = y - 1; dy <= y + 1; dy++) {
                    for (int dx = x - 1; dx <= x + 1; dx++) {
                        if (isInGrid(dy, dx) && !checked[dy][dx] && grid[dy][dx] == 0) { //check isInGrid, isAlreadyVisited and cell = 0
                            list.add(new Cell(dy, dx));
                            checked[dy][dx] = true;
                        }
                    }
                }
            }
            path++; //increase, when all Neighbors checked
        }
        return -1;
    }

    private boolean isInGrid(int y, int x) {
        return y >= 0 && y < grid.length && x >= 0 && x < grid[y].length;
    }

    private static class Cell {
        private final int y;
        private final int x;

        public Cell(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

}
