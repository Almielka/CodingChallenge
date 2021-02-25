package leetCode.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anna S. Almielka
 */

public class GraphBipartite {

    /**
     * 785. Is Graph Bipartite?
     * <p>
     * There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1.
     * You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to.
     * More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:
     * <p>
     * There are no self-edges (graph[u] does not contain u).
     * There are no parallel edges (graph[u] does not contain duplicate values).
     * If v is in graph[u], then u is in graph[v] (the graph is undirected).
     * The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
     * A graph is bipartite if the nodes can be partitioned into two independent sets A and B
     * such that every edge in the graph connects a node in set A and a node in set B.
     * <p>
     * Return true if and only if it is bipartite.
     *
     * @param graph an undirected graph
     * @return {@code true} if {@code graph} is bipartite, {@code false} otherwise
     */
    // Runtime: 1 ms
    // Memory Usage: 39.3 MB
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
