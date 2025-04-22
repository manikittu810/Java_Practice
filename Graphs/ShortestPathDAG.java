package InterviewPrep.Graphs;

import java.util.*;

class Pair{
    int vertex;
    int weight;
    Pair(int vertex,int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class ShortestPathDAG {
    private void topologicalSortDFS(List<List<Pair>> adjList,int source,Stack<Integer> st,boolean[] visited){
        visited[source]=true;
        for(Pair v :  adjList.get(source)){
            if(!visited[v.vertex]){
                topologicalSortDFS(adjList, v.vertex, st, visited);
            }
        }
        st.push(source);
    }
    public void shortestPath(List<List<Pair>> adjList,int source,int V){
        Stack<Integer> st = new Stack<>();
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologicalSortDFS(adjList,source,st,visited);
            }
        }

        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;

        while(!st.isEmpty())
        {
            int u = st.pop();//vertex -> v.vertex and now checking if v.vertex -> that means some vertex number now d[u] is literally ->v.vertex
            if(distance[u]!=Integer.MAX_VALUE) {
                for (Pair v : adjList.get(u)) {
                    if (distance[v.vertex] > distance[u] + v.weight) {
                        distance[v.vertex] = distance[u] + v.weight;
                    }
                }
            }
        }
        printDAG(distance,source);
    }
    private void printDAG(int[] distance,int source){
        System.out.println("The shortestPath for the given source : "+source+" to all its vertices is : ");
        for(int i : distance){
            System.out.print((i == Integer.MAX_VALUE) ? "INF " : i+" ");
        }
    }
}


class TestDAGShortestPath{
    public static void main(String[] args) {
        ShortestPathDAG obj = new ShortestPathDAG();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter number of vertices : ");
            int V = sc.nextInt();
            List<List<Pair>> adjList = new ArrayList<>();
            for(int j=0;j<V;j++){
                adjList.add(new ArrayList<>());
            }
            System.out.println("Enter number of Edges : ");
            int edges = sc.nextInt();
            System.out.println("Enter  the u->(v,w) values with "+edges+" edges");
            for(int k = 0;k<edges;k++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                adjList.get(u).add(new Pair(v,w));
            }
            System.out.println("Enter source vertex to start with : ");
            int source=sc.nextInt();
            obj.shortestPath(adjList,source,V);
        }
        sc.close();
    }
}