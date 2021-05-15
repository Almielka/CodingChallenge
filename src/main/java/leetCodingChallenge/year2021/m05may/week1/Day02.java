package leetCodingChallenge.year2021.m05may.week1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 * 02.05.2021
 */

public class Day02 {

    /**
     * There are n different online courses numbered from 1 to n.
     * You are given an array courses where courses[i] = [duration_i, lastDay_i]
     * indicate that the ith course should be taken continuously for duration_i days
     * and must be finished before or on lastDay_i.
     * <p>
     * You will start on the 1st day and you cannot take two or more courses simultaneously.
     * Return the maximum number of courses that you can take.
     * <p>
     * Constraints:
     * 1 <= courses.length <= 10^4
     * 1 <= durationi, lastDayi <= 10^4
     *
     * @param courses an array courses where courses[i] = [duration_i, lastDay_i]
     * @return the maximum number of courses
     */
    // Runtime: 27 ms
    // Memory Usage: 47.6 MB
    // Time Complexity: O(log(n))
    // Space Complexity: O(1)
    public int scheduleCourse(int[][] courses) {
        if (courses.length == 1) return 1;
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        // PriorityQueue is implemented as a Max-Heap
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for (int[] c : courses) {
            if (time + c[0] <= c[1]) {
                queue.offer(c[0]);
                time += c[0];
            } else if (!queue.isEmpty() && queue.peek() > c[0]) {
                time += c[0] - queue.poll();
                queue.offer(c[0]);
            }
        }
        return queue.size();
    }

}
