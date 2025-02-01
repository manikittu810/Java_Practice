package InterviewPrep.Graphs.bellmanFord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class BellmanFord{
    static class Edge{
        int src,dest,wt;
        Edge(int v,int d,int wt){
            this.src=v;
            this.dest=d;
            this.wt=wt;
        }
    }
    static  void bellmanFord(List<Edge> list,int V,int src){
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        for(int i=0;i<V-1;i++){

            for(Edge e : list){

                if(dist[e.src]!=Integer.MAX_VALUE  && dist[e.dest] > dist[e.src]+e.wt){
                        dist[e.dest] = dist[e.src]+e.wt;
                }
            }
        }
        for(Edge e : list){
            if(dist[e.src]!=Integer.MAX_VALUE && dist[e.dest]> dist[e.src]+e.wt){
                System.out.println("Graph contains a negative weighted cycle");
                return ;
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i] == Integer.MAX_VALUE){
                System.out.println(i + "->"+"INF");
            }else{
                System.out.println(i + "->"+dist[i]);
            }
        }
    }
}
public class TestBellmanFord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int V = sc.nextInt();
            int E = sc.nextInt();
            List<BellmanFord.Edge> edges =new ArrayList<>();
            for(int i=0;i<E;i++){
                int src = sc.nextInt();
                int dest = sc.nextInt();
                int wt = sc.nextInt();
                edges.add(new BellmanFord.Edge(src,dest,wt));
            }
            System.out.println("Enter the source of the graph : ");
            int src = sc.nextInt();
            BellmanFord.bellmanFord(edges,V,src);
        }
        sc.close();
    }
}
