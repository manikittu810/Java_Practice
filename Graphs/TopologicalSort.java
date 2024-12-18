package InterviewPrep.Graphs;

import java.util.*;

public class TopologicalSort {
    public void kahnsBFS(List<List<Integer>> adjList,int V){
        List<Integer> topologicalOrder = new ArrayList<>();
        int[] inDegree = new int[V];
        for(int i=0;i<V;i++){
            for(int u : adjList.get(i)){
                    inDegree[u]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int u = q.poll();
            topologicalOrder.add(u);
            count++;
            for(int i :adjList.get(u)){
                inDegree[i]--;
                if(inDegree[i]==0){
                    q.offer(i);
                }
            }
        }
        if (count != V) {
            System.out.println("There is a cycle in the given Directed graph.");
        } else {
            System.out.println("Topological Order: " + topologicalOrder);
        }
    }
}

class TestKahnsBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TopologicalSort obj = new TopologicalSort();
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter number of vertices:");
            int V = sc.nextInt();
            List<List<Integer>> adjList = new ArrayList<>(V);
            for (int j = 0; j < V; j++) {
                adjList.add(new ArrayList<>());//[[],[],[],[]]
            }
            System.out.println("Enter number of edges:");
            int edges = sc.nextInt();
            System.out.println("Enter the edges (u v):");
            for (int k = 0; k < edges; k++) {
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    if(u>=0 &&u<V && v>=0&&v<V){
                        AdjacencyListForDirectedGraph(adjList, u, v);
                    }else{
                        System.out.println("Invalid edge from "+u+" to "+"v");
                    }
                }
            printList(adjList);
            obj.kahnsBFS(adjList,V);
        }
        sc.close();
    }

    public static void AdjacencyListForDirectedGraph(List<List<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
    }

    private static void printList(List<List<Integer>> adjList) {
        System.out.println("Directed graph adjList representation : ");
        for(int i=0;i<adjList.size();i++){
            System.out.print(i+" -> ");
            for(int j:adjList.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}