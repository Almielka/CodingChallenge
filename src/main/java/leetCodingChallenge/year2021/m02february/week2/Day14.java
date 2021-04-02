package leetCodingChallenge.year2021.m02february.week2;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 14.02.2021
 */

public class Day14 {

    public boolean isBipartite(int[][] graph) {

        boolean[] isOneSubset = new boolean[graph.length];
        boolean[] isChecked = new boolean[graph.length];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (isChecked[i]) continue;
            queue.add(i);
            isOneSubset[i] = true;
            isChecked[i] = true;
            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : graph[node]) {
                    if (!isChecked[neighbor]) {
                        isOneSubset[neighbor] = !isOneSubset[node]; //set the opposite value
                        isChecked[neighbor] = true;
                        queue.add(neighbor);
                    } else if (isOneSubset[neighbor] == isOneSubset[node]) {
                        return false;  //isBipartite = false, when current Node and its Neighbors belong one Subset
                    }
                }
            }

        }
        return true;
    }

}
