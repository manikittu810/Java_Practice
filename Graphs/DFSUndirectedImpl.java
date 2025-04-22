package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSUndirectedImpl {
    public void implementDFSRecursive(List<List<Integer>> adj,int source,boolean[] visited,List<Integer> l){
        visited[source] = true;
        l.add(source);
        for(int i:adj.get(source)){
            if(!visited[i]){
//                visited[i] = true;
                implementDFSRecursive(adj,i,visited,l);
            }
        }


    }
    public List<Integer> DFS(List<List<Integer>> adj){
        List<Integer> l = new ArrayList<>();
        boolean []visited = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!visited[i]) {
                implementDFSRecursive(adj, i, visited, l);
            }
        }
        return l;
        }
    }