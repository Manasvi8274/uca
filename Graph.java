import java.util.*;

// Graph class with various algorithms
public class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Edge>[] adjList; // Adjacency list

    // Edge class to represent edges with weights
    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination, int weight) {
        adjList[source].add(new Edge(destination, weight));
        adjList[destination].add(new Edge(source, weight)); // For undirected graph
    }

    // BFS (Breadth-First Search) algorithm
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (Edge edge : adjList[vertex]) {
                if (!visited[edge.destination]) {
                    visited[edge.destination] = true;
                    queue.add(edge.destination);
                }
            }
        }
        System.out.println();
    }

    // DFS (Depth-First Search) algorithm
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        dfsHelper(start, visited);
        System.out.println();
    }

    // Helper method for DFS
    private void dfsHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Edge edge : adjList[vertex]) {
            if (!visited[edge.destination]) {
                dfsHelper(edge.destination, visited);
            }
        }
    }

    // Dijkstra's Algorithm (Shortest path from source)
    public void dijkstra(int source) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        pq.add(new Edge(source, 0));

        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll();
            int vertex = currentEdge.destination;

            for (Edge edge : adjList[vertex]) {
                int newDist = distances[vertex] + edge.weight;
                if (newDist < distances[edge.destination]) {
                    distances[edge.destination] = newDist;
                    pq.add(new Edge(edge.destination, newDist));
                }
            }
        }

        // Output the shortest distance to each vertex
        for (int i = 0; i < vertices; i++) {
            System.out.println("Distance from " + source + " to " + i + " is " + distances[i]);
        }
    }

    // Floyd-Warshall Algorithm (All-pairs shortest paths)
    public void floydWarshall() {
        int[][] dist = new int[vertices][vertices];
        
        // Initialize distance matrix
        for (int i = 0; i < vertices; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        
        for (int i = 0; i < vertices; i++) {
            for (Edge edge : adjList[i]) {
                dist[i][edge.destination] = edge.weight;
            }
        }
        
        // Floyd-Warshall Algorithm
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE
                            && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        // Print shortest distances
        System.out.println("Floyd-Warshall shortest distances:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Bellman-Ford Algorithm (Shortest path from source)
    public void bellmanFord(int source) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        for (int i = 1; i < vertices; i++) {
            for (int u = 0; u < vertices; u++) {
                for (Edge edge : adjList[u]) {
                    if (distances[u] != Integer.MAX_VALUE && distances[u] + edge.weight < distances[edge.destination]) {
                        distances[edge.destination] = distances[u] + edge.weight;
                    }
                }
            }
        }

        // Check for negative weight cycles
        for (int u = 0; u < vertices; u++) {
            for (Edge edge : adjList[u]) {
                if (distances[u] != Integer.MAX_VALUE && distances[u] + edge.weight < distances[edge.destination]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        // Output the shortest distance to each vertex
        for (int i = 0; i < vertices; i++) {
            System.out.println("Distance from " + source + " to " + i + " is " + distances[i]);
        }
    }

    // Detect Cycle in an Undirected Graph using DFS
    public boolean hasCycle() {
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && dfsCycleHelper(i, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    // Helper method to detect cycle
    private boolean dfsCycleHelper(int vertex, boolean[] visited, boolean[] recStack) {
        visited[vertex] = true;
        recStack[vertex] = true;

        for (Edge edge : adjList[vertex]) {
            if (!visited[edge.destination] && dfsCycleHelper(edge.destination, visited, recStack)) {
                return true;
            } else if (recStack[edge.destination]) {
                return true;
            }
        }

        recStack[vertex] = false;
        return false;
    }
    //detect cycle using bfs
    public boolean detectcyclebfs(int n , ArrayList<ArrayList<Integer>>adj){
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++)    vis[i]=false;
        for(int i=0;i<n;i++){
            if(vis[i]==true)    continue;
            if(bfshelper(i,n,adj,vis))  return true;
        }
        return false;
    }

    class Pair{
        int a;
        int b;

        Pair(int a1,int b1){
            this.a=a1;
            this.b=b1;
        }
    }

    private boolean bfshelper(int src , int n , ArrayList<ArrayList<Integer>>adj , boolean[] vis){
        vis[src]=true;
        Queue<Pair> q = new LinkedList<>();
        int b=-1;
        q.add(new Pair(src , b));

        while(!q.isEmpty()){
            int nd=q.peek().a;
            int prt=q.peek().b;
            for(int x:adj.get(nd)){
                if(vis[x] == false){
                    vis[x]=true;
                    q.add(new Pair(x , nd));
                }
                else if(prt!=x){
                    return true;
                }
            }
        }
        return false;
    }

    //bellman ford
    public static void calculateMinDistance(int minDist[] ,int src , int[][] edges , int n){
        for(int i=0;i<n-1;i++){
            for(int edge[] :edges){
                int u=edge[0];
                int v=edge[1];
                int wt=edge[2];
                if(minDist[u] != Integer.MAX_VALUE && (minDist[u] + wt < minDist[v])){
                    minDist[v] = minDist[u] + wt;
                }
            }
        }
    }

    public static int findShortestDistance(int src , int dest , int edges[][] , int n){
        int minDist[] = new int[n];//notoverflow;
        Arrays.fill(minDist , Integer.MAX_VALUE);
        minDist[src]=0;
        //calculate min minDist
        calculateMinDistance(minDist , src , edges , n);

        return minDist[dest] == Integer.MAX_VALUE ? -1:minDist[dest];
    }

    // Main method to test the Graph class
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 20);
        graph.addEdge(1, 2, 30);
        graph.addEdge(1, 3, 40);
        graph.addEdge(2, 3, 50);
        graph.addEdge(3, 4, 60);

        System.out.print("BFS starting from vertex 0: ");
        graph.bfs(0);

        System.out.print("DFS starting from vertex 0: ");
        graph.dfs(0);

        System.out.println("Dijkstra's shortest paths from vertex 0:");
        graph.dijkstra(0);
        
        System.out.println("Floyd warshal shortest paths");
        graph.floydWarshall();

        System.out.println("Bellman-Ford shortest paths from vertex 0:");
        graph.bellmanFord(0);

        System.out.println("Does the graph contain a cycle? " + (graph.hasCycle() ? "Yes" : "No"));
    }
}
