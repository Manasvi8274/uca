package semsix.rohitsir.feb;
import java.util.*;
// public class three{
//     public static void main(String[] args) {
                
//     }
// }

class ShortestPath {
    public static int shrtpath(int n, int src, int dest, List<List<Integer>> edges) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { src, 0 });

        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (List<Integer> edge : edges) {
            int u = edge.get(0), v = edge.get(1), w = edge.get(2);
            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(new int[] { v, w });
        }

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int vertex = current[0], currDist = current[1];

            if (vertex == dest)
                return currDist;

            if (currDist > dist[vertex])
                continue;

            for (int[] neighbor : graph.getOrDefault(vertex, new ArrayList<>())) {
                int nextVertex = neighbor[0], weight = neighbor[1];
                int newDist = currDist + weight;

                if (newDist < dist[nextVertex]) {
                    dist[nextVertex] = newDist;
                    pq.add(new int[] { nextVertex, newDist });
                }
            }
        }
        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }
    //second question

    public static List<Integer> solve(int n, int q, List<Integer> closing_prices, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();

        for (int H : queries) {
            result.add(findWeakestPeak(closing_prices, n, H));
        }

        return result;
    }
    

    private static int findWeakestPeak(List<Integer> prices, int n, int H) {
        Deque<Integer> deque = new LinkedList<>();
        int[] maxInWindow = new int[n - H + 1];

        // Process first window
        for (int i = 0; i < H; i++) {
            while (!deque.isEmpty() && prices.get(deque.peekLast()) <= prices.get(i)) {
                deque.pollLast();
            }
            deque.addLast(i);
        }
        maxInWindow[0] = prices.get(deque.peekFirst());

        // Process remaining windows
        for (int i = H; i < n; i++) {
            // Remove elements not in this window
            while (!deque.isEmpty() && deque.peekFirst() <= i - H) {
                deque.pollFirst();
            }

            // Remove elements smaller than current
            while (!deque.isEmpty() && prices.get(deque.peekLast()) <= prices.get(i)) {
                deque.pollLast();
            }
            deque.addLast(i);

            // Max element in current window
            maxInWindow[i - H + 1] = prices.get(deque.peekFirst());
        }

        // Weakest Peak = Minimum of all window peaks
        return Arrays.stream(maxInWindow).min().getAsInt();
    }
}



// public class three{
    // public static void calculateMinDistance(int minDist[] ,int src , int[][] edges , int n){
    //     for(int i=0;i<n-1;i++){
    //         for(int edge[] :edges){
    //             int u=edge[0];
    //             int v=edge[1];
    //             int wt=edge[2];
    //             if(minDist[u] != Integer.MAX_VALUE && (minDist[u] + wt < minDist[v])){
    //                 minDist[v] = minDist[u] + wt;
    //             }
    //         }
    //     }
    // }

    // public static int findShortestDistance(int src , int dest , int edges[][] , int n){
    //     int minDist[] = new int[n];//notoverflow;
    //     Arrays.fill(minDist , Integer.MAX_VALUE);
    //     minDist[src]=0;
    //     //calculate min minDist
    //     calculateMinDistance(minDist , src , edges , n);

    //     return minDist[dest] == Integer.MAX_VALUE ? -1:minDist[dest];
    // }
    // public static void main(String[] args){
    //     int n=3;
    //     int[][] edges = {new int[] {0,1,5} , new int[] {1,2,1} , new int[] {0,2,10}};

    //     System.out.println("\n"+findShortestDistance(0,2,edges, n));
    // }
// }