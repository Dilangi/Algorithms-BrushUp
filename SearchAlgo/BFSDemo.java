package SearchAlgo;

import java.util.*;

public class BFSDemo {
    /** Shortest path in an unweighted graph using BFS
     * Graph representation:
     * Used an adjacency list (Map<Integer, List<Integer>>) for efficiency and flexibility.

     * Visited set:
     * Set<Integer> visited prevents revisiting nodes (avoids infinite loops).

     * Queue for BFS:

     * Queue<Integer> queue = new LinkedList<>(); ensures FIFO order.
     * Add start node → process neighbors → push unvisited neighbors.

     * Best practices followed:
     * Encapsulation: BFS is a separate method.
     * Use of Set instead of boolean[] for flexibility (works for non-sequential node IDs).
     * getOrDefault ensures safe neighbor lookup.
     * Readable variable names (visited, queue, neighbor)

     * Time Complexity:
     * O(V + E) → visit all vertices and edges once.
     * Space Complexity:
     * O(V) for visited + queue.
     **/
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 4));
        graph.put(3, Arrays.asList(1, 5));
        graph.put(4, Arrays.asList(1, 2, 5));
        graph.put(5, Arrays.asList(3, 4));

        int startNode = 2;
        System.out.println("BFS traversal starting from node " + startNode + ":");
        bfs(graph, startNode);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int startNode) {
        Set<Integer> visited = new HashSet<>(); //To track visited nodes
        Queue<Integer> queue = new LinkedList<>(); //Queue for BFS

        visited.add(startNode);
        queue.offer(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " "); // Process the node

            for (int neighbor : graph.getOrDefault(currentNode, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
