package leetCodingChallenge.year2021.m04april.week4;

import java.util.*;

/**
 * @author Anna S. Almielka
 * 24.04.2021
 */

public class Day24 {

    /**
     * There are n servers numbered from 0 to n-1 connected by undirected server-to-server
     * connections forming a network where connections[i] = [a, b] represents a connection
     * between servers a and b. Any server can reach any other server directly or indirectly through the network.
     * <p>
     * A critical connection is a connection that, if removed,
     * will make some server unable to reach some other server.
     * Return all critical connections in the network in any order.
     * <p>
     * Constraints:
     * 1 <= n <= 10^5
     * n-1 <= connections.length <= 10^5
     * connections[i][0] != connections[i][1]
     * There are no repeated connections.
     *
     * @param n an integer total number of servers
     * @param connections a list of list of integers
     * @return all critical connections
     */
    List<List<Integer>> criticalConnections;
    List<Integer>[] graphEdges;
    int[] disc;
    int[] low;
    int time = 1;

    // Runtime: 98 ms
    // Memory Usage: 105 MB
    // Time Complexity: O(n + m) where m = connections.size(); n = total number of servers
    // Space Complexity: O(n + m)
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        criticalConnections = new ArrayList<>();
        graphEdges = new ArrayList[n];
        buildGraphEdges(connections);
        disc = new int[n];
        low = new int[n];
        dfs(0, -1);
        return criticalConnections;
    }

    public void dfs(int curr, int prev) {
        disc[curr] = low[curr] = time++;
        for (int next : graphEdges[curr]) {
            if (disc[next] == 0) {
                dfs(next, curr);
                low[curr] = Math.min(low[curr], low[next]);
            } else if (next != prev) {
                low[curr] = Math.min(low[curr], disc[next]);
            }
            if (low[next] > disc[curr])
                criticalConnections.add(Arrays.asList(curr, next));
        }
    }

    private void buildGraphEdges(List<List<Integer>> connections) {
        for (int i = 0; i < graphEdges.length; i++) {
            graphEdges[i] = new ArrayList();
        }
        for (List<Integer> con : connections) {
            graphEdges[con.get(0)].add(con.get(1));
            graphEdges[con.get(1)].add(con.get(0));
        }
    }

}
