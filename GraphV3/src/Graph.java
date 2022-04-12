import java.util.ArrayList;
//implementation of Tarjan’s algorithm for finding articulation points.

public class Graph {
    static int time;


    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void APUtil(ArrayList<ArrayList<Integer>> adj , int u, boolean visited[], int disc[], int low[], int parent, boolean isAP[]){
        int children = 0; //count of children in DFS tree
        visited[u] = true; //mark the current node as visited
        disc[u] = low[u] = ++time; //initialize discovery time and low value

        for(Integer v : adj.get(u)){   //go through all vertices adjacent to this
            if(!visited[v]){
                children++;                           //if v is not visited yet, make it a child of u
                APUtil(adj, v,visited,disc,low,u,isAP);    //in dfs tree and recur for it
                low[u] = Math.min(low[u],low[v]);     //check if the subtree rooted with v has a connection to one of the ancestors of u

                if(parent != -1 && low[v]>= disc[u]) { //if u is not root and low value of one of its child is more than discovery value of u
                    isAP[u] = true;
                }else if (v != parent){
                    low[u] = Math.min(low[u],disc[v]);  //update low value of u for parent function calls
                }
            }
        }
        if (parent ==-1 && children>1){
            isAP[u] = true;                            //if u is root of dfs and has two or more children
        }
    }

    static void AP(ArrayList<ArrayList<Integer>> adj, int V){
        boolean [] visited = new boolean[V];
        int [] disc = new int[V];
        int [] low = new int[V];
        boolean[] isAP = new boolean[V];
        int time = 0, par = -1;

        // adding this loop so that the code works even if we are given disconnected graph

        for(int u=0; u<V; u++){
            if(visited[u] == false){
                APUtil(adj,u,visited,disc,low,par,isAP);
            }
        }

        for(int u=0; u<V; u++){
            if(visited[u] == true){
                System.out.print(u + " ");
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>(V);
        for(int i = 0; i<V;i++){
            adj1.add(new ArrayList<Integer>());
            addEdge(adj1,1,0);
            addEdge(adj1,0,2);
            addEdge(adj1,2,1);
            addEdge(adj1,0,3);
            addEdge(adj1,3,4);
            System.out.println("articulation points in the first graph");
            AP(adj1,V);
        }
    }
}
