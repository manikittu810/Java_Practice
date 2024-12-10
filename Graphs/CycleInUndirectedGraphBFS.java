package InterviewPrep.Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInUndirectedGraphBFS {
    static class Node{
        int currentVertex;
        int parentVertex;
        Node(int currentVertex,int parentVertex){
            this.currentVertex= currentVertex;
            this.parentVertex=parentVertex;
        }
    }

    public boolean detectCycleBFS(List<List<Integer>> adj){
        boolean [] visited = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                if(cycleDetectedByBFS(adj,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cycleDetectedByBFS(List<List<Integer>> l,boolean[] visited,int source, int parent){
        visited[source] = true;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(source,parent));
        while(!q.isEmpty()){
            Node u = q.poll();
            int currentVertex = u.currentVertex;
            int parentVertex = u.parentVertex;
            for(int i:l.get(currentVertex)){
                if(!visited[i]){
                    visited[i]=true;
                    q.offer(new Node(i,currentVertex));
//                    if(cycleDetectedByBFS(l,visited,i,parentVertex)){
//                        return true;
//                    }
                }
                else if(i!=parentVertex){
                    return true;
                }
            }
        }
        return false;
    }
}
