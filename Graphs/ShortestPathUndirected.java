package InterviewPrep.Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathUndirected {
    public int[] findShortestPath(List<List<Integer>> adjList, int v, int source){
        int []distance = new int[v];
        boolean []visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.offer(source);
        distance[source] = 0;
        while(!q.isEmpty()){
            int exploreVertex = q.poll();//u is the vertex need to be explored
            for(int i: adjList.get(exploreVertex)){
                if(!visited[i]){
                    visited[i] =true;
                    distance[i] = distance[exploreVertex]+1;
                    q.add(i);
                }
            }

        }
        return distance;
    }
}
