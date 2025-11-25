import java.util.*;

public class Dijkstra {
    private static final int INF = Integer.MAX_VALUE;
    
    public static void dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];
        
        Arrays.fill(distance, INF);
        distance[source] = 0;
        
        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(distance, visited);
            visited[u] = true;
            
            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && 
                    distance[u] != INF && 
                    distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        
        printSolution(distance, source);
    }
    
    private static int minDistance(int[] distance, boolean[] visited) {
        int min = INF, minIndex = -1;
        
        for (int v = 0; v < distance.length; v++) {
            if (!visited[v] && distance[v] <= min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    private static void printSolution(int[] distance, int source) {
        System.out.println("Shortest distances from vertex " + source + ":");
        for (int i = 0; i < distance.length; i++) {
            System.out.println("To vertex " + i + ": " + 
                (distance[i] == INF ? "INF" : distance[i]));
        }
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        
        dijkstra(graph, 0);
    }
}