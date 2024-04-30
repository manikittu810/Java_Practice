package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void GraphBFS(ArrayList<ArrayList<Integer>> adjList, int v, int s){
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();
        visited[s] =true;
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+ " ");
            for(int i: adjList.get(u)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int v= sc.nextInt();
            int e = sc.nextInt();
            int s = sc.nextInt();
            ArrayList<ArrayList<Integer>> res = new ArrayList<>(v);
            for(int j=0;j<v;j++){
                res.add(new ArrayList<>());
            }
            for(int k=0;k<e;k++){
                int from  = sc.nextInt();
                int to = sc.nextInt();
                res.get(from).add(to);
                res.get(to).add(from);
            }
            GraphBFS(res,v,s);
        }
        sc.close();
    }
}
