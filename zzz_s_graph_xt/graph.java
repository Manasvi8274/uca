import java.util.*;
import org.w3c.dom.ls.LSException;

class unweighted_undirected_graph{
    int n;
    int e;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public unweighted_undirected_graph(int n, int e) {
        this.n = n;
        this.e = e;
        for(int i=0;i <= n;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public int get_number_of_edges(){
        return e;
    }

    public void addEdge(int n1, int n2){
        addEdge(adj ,n1, n2);
    }

    private void addEdge(ArrayList<ArrayList<Integer>> adj , int n1 , int n2){
        adj.get(n1).add(n2);
        adj.get(n2).add(n1);
    }

    public ArrayList<ArrayList<Integer>> BFS(int root){
        ArrayList<ArrayList<Integer>> bfs = new ArrayList<>();
        Queue<Integer> q =new LinkedList<>();
        int[] visited = new int[n+1];
        ArrayList<Integer> curr = new ArrayList<>();
        // System.out.println(n + "\t" + e);
        curr.add(root);
        bfs.add(curr);
        visited[root]=1;
        q.add(root);        

        while(q.size()!=0){
            Queue<Integer> q1 = new LinkedList<>();
            curr = new ArrayList<>();
            for(int x:q){
                if(visited[x] == 0){
                    curr.add(x);
                    visited[x]=1;
                }
                for(int y:adj.get(x)){
                    if(visited[y] == 0){
                        q1.add(y);
                    }
                }
            }
            bfs.add(curr);
            q = q1;
            System.out.println("hlo");
            // for(int x:q){
            // System.out.print("q1 size = " + q1.size() +"\t");
            // }
        }

        return bfs;
    }

    
    public List<Integer> BFS_map(int root){
        List<Integer> bfs1 = new ArrayList<>();
        bfs1.add(0);
        Queue<Integer> q =new LinkedList<>();
        Map<Integer,Integer> visited = new HashMap<>();        
        visited.put(root,1);
        q.add(root);        

        while(q.size()!=0){
            Queue<Integer> q1 = new LinkedList<>();
            for(int x:q){
                if(!visited.containsKey(x)){
                    bfs1.add(x);
                    visited.put(x,1);
                }
                for(int y:adj.get(x)){
                    if(!visited.containsKey(y)){
                        q1.add(y);
                    }
                }
            }
            q = q1;
        }
        return bfs1;
    }

    public void DFS(int root,boolean vis[] ,ArrayList<Integer> dfs){
        vis[root] = true;
        dfs.add(root);
        for(int x:adj.get(root)){
            if(vis[x] == false){
                DFS(x , vis , dfs);
            }
        }
    }
}


public class graph {
    public static void main(String[] args) {
        String str = "Hello";
        String str1=" World";
        str=str+str1;
        System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // int n,e;
        // n=sc.nextInt();
        // e=sc.nextInt();
        // unweighted_undirected_graph gp = new unweighted_undirected_graph(n, e);

        // for(int i=0;i<e;i++){
        //     int a,b;
        //     a=sc.nextInt();
        //     b=sc.nextInt();
        //     gp.addEdge(a, b);
        // }

        

        // List<Integer> bfs = gp.BFS_map(0);
        // System.out.println();
        // for(int i = 0; i < bfs.size();i++){
        //     System.out.print(bfs.get(i) +"\t");
        //     // System.out.println();
        // }
    }
}



class unweighted_directed_graph{
    int n;
    int e;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public unweighted_directed_graph(int n, int e) {
        this.n = n;
        this.e = e;
        for(int i=0;i <= n;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public int get_number_of_edges(){
        return e;
    }

    public void addEdge(int n1, int n2){
        addEdge(adj ,n1, n2);
    }

    private void addEdge(ArrayList<ArrayList<Integer>> adj , int n1 , int n2){
        adj.get(n1).add(n2);
    }

    public ArrayList<ArrayList<Integer>> BFS(int root){
        ArrayList<ArrayList<Integer>> bfs = new ArrayList<>();

        Queue<Integer> q =new LinkedList<>();

        ArrayList<Integer> visited = new ArrayList<>(n+1);

        ArrayList<Integer> curr = new ArrayList<>();

        for(int x:adj.get(root)){
            q.add(x);
            visited.set(x, 1);
            curr.add(x);
        }
        bfs.add(curr);

        while(!q.isEmpty()){
            Queue<Integer> q1 = new LinkedList<>();
            curr = new ArrayList<>();
            for(int x:q){
                if(visited.get(x) == 0){
                    curr.add(x);
                    visited.set(x,1);
                    for(int y:adj.get(x)){
                        if(visited.get(y) == 0){
                            q1.add(y);
                        }
                    }
                }
            }
            bfs.add(curr);
            q = q1;
        }

        return bfs;
    }
}

