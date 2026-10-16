/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;


import visualizer.Edge;
import visualizer.Vertex;
import java.util.*;

public class CycleDetection {

    public static boolean hasCycle(
            Map<Vertex, List<Edge>> graph) {

        Set<Vertex> visited = new HashSet<>();

        for (Vertex vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                if (dfs(vertex, null, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(
            Vertex current,
            Vertex parent,
            Map<Vertex, List<Edge>> graph,
            Set<Vertex> visited) {

        visited.add(current);

        for (Edge edge : graph.getOrDefault(
                current, Collections.emptyList())) {

            Vertex next = getOtherVertex(edge, current);

            if (next == null) {
                continue;
            }

            if (!visited.contains(next)) {
                if (dfs(next, current, graph, visited)) {
                    return true;
                }
            } else if (!next.equals(parent)) {
                return true;
            }
        }

        return false;
    }

    private static Vertex getOtherVertex(
            Edge edge, Vertex current) {

        // Connect this method to your Edge class's
        // actual start and end vertex getters.
        return null;
    }
}


