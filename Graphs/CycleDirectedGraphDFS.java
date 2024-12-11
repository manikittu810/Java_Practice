package InterviewPrep.Graphs;

import java.util.List;

public class CycleDirectedGraphDFS {
    public boolean detectCycleInDirectGraphUsingDFS(List<List<Integer>> adj, int v){
        boolean[] visited = new boolean[v];
        boolean [] inRecursionNow = new boolean[v];
        for(int i =0;i<v;i++){
            if(!visited[i] && dfsRecursive(adj,visited,inRecursionNow,i)){
                return true;
            }
        }
        return false;
    }
    private boolean dfsRecursive(List<List<Integer>> adj, boolean[]visited,boolean[]inRecursionNow,int source){
        visited[source] = true;
        inRecursionNow[source] = true;
        for(int i:adj.get(source)){
            if(!visited[i] && dfsRecursive(adj,visited,inRecursionNow,i)){
                return true;
            }
            else if(inRecursionNow[i]){
                return true;
            }
        }
        inRecursionNow[source] = false;
        return false;
    }

}
