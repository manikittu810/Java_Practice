package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortKahnsDFS {
    public void kahnsDFS(List<List<Integer>>adjList, int V){
        boolean[] visited= new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfsRecursive(adjList,visited,i,st);
            }
        }
        List<Integer> topologicalDFSList =new ArrayList<>();
        while(!st.isEmpty()){
            int u = st.pop();
            topologicalDFSList.add(u);
        }
        System.out.println("Topological Kahn's DFS order : " + topologicalDFSList);
    }
    private void dfsRecursive(List<List<Integer>> adjList, boolean[] visited,int source,Stack<Integer> st){
        visited[source] = true;
        for(int i : adjList.get(source)){
            if(!visited[i]){
                visited[i]= true;
                dfsRecursive(adjList,visited,i,st);
            }
        }
        st.push(source);
    }
}
