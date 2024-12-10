package InterviewPrep.Graphs;

import java.util.List;

public class CycleInUndirectedGraphDFS {
    public boolean isCycleDetectedDFS(List<List<Integer>> adjList){
        boolean [] visited = new boolean[adjList.size()];
        for(int i=0;i<adjList.size();i++){
            if(cycleDFSDetect(adjList,visited,i,-1)){
                return true;
            }
        }
        return false;
    }
    public boolean cycleDFSDetect(List<List<Integer>> l,boolean[] visited,int source,int parent){
        visited[source] = true;
        for(int i : l.get(source)){
            if(!visited[i]){
                if(cycleDFSDetect(l,visited,i,source)){
                    return true;
                }
                else if(i!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}
