package InterviewPrep.Graphs.practiceGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSPractice {
    public void disconnectedBFS(List<List<Integer>> list,int v){
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                BFSTraverse(list,i,visited);
            }
        }
    }
    public void BFSTraverse(List<List<Integer>> list,int source, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[source] =true;
        q.offer(source);
        while(!q.isEmpty()){
            int exploreVertex = q.poll();
            System.out.print(exploreVertex +" ");
            for(int i : list.get(exploreVertex)){
                if(!visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
        System.out.println();

    }
}