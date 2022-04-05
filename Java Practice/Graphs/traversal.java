package Graphs;

import java.util.*;

public class traversal {

    public static void addEdge(List<List<Integer>> adj, int v1, int v2) {
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public static void printGraph(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++)
            System.out.println(adj.get(i));
    }

    public static void main(String[] args) {
        // Number of vertices
        int v = 5;
        List<List<Integer>> adj = new ArrayList<List<Integer>>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);

    }
}
