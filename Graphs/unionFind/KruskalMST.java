package InterviewPrep.Graphs.unionFind;


import java.util.Arrays;
import java.util.Scanner;

public class KruskalMST {
    static class Edges implements Comparable<Edges>{
        int src,dest,wt;
        Edges(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        public int compareTo(Edges otherEdge){
            return this.wt - otherEdge.wt;
        }
    }

    static class Subset{
        int parent,rank;
    }

    Edges []edges;
    int V,E;

    KruskalMST(int v,int e){
        V=v;
        E=e;
        edges = new Edges[E];
    }

    private int find(Subset []subset, int i){
        if(subset[i].parent == i){
            return i;
        }
        subset[i].parent = find(subset,subset[i].parent);
        return subset[i].parent;
    }

    private void unionByRank(Subset []subset,int x,int y){
        int xP = find(subset,x);
        int yP = find(subset,y);

        if(xP==yP){
            return ;
        }
        if(subset[xP].rank< subset[yP].rank){
            subset[xP].parent = yP;
        }else if(subset[xP].rank > subset[yP].rank){
            subset[yP].parent = xP;
        }
        else{
            subset[xP].parent = yP;
            subset[xP].rank++;
        }
    }

    void KruskalMST(){
        int minWeight = 0;
        Edges []res = new Edges[V-1];
        Arrays.sort(edges);

        Subset []subset = new Subset[V];

        //subset creation visualization below

        for(int v=0;v<V;v++){
            // Subset -> subset[
            // edge->0[src,dest,wt]parent=0.rank=0,
            // edge->1[src,dest,wt]parent=1.rank=0,
            // edge->2[src,dest,wt]parent=2.rank=0,
            // edge->3[src,dest,wt].parent=3.rank=0,
            // edge->4[src,dest,wt]parent=4.rank=0
            // ]
            subset[v] = new Subset();
            subset[v].parent = v;
            subset[v].rank = 0;
        }


        for(int i=0,s=0;i<E && s<V-1;i++){

            Edges nextEdge = edges[i];

            int x = find(subset,nextEdge.src);
            int y = find(subset,nextEdge.dest);

            if(x!=y){
                res[s++] = nextEdge;
                unionByRank(subset,x,y);
                minWeight+= nextEdge.wt;
            }
        }

        System.out.println("Edges of KruskalMST");
        for(int i =0;i<V-1;i++){
            System.out.println(res[i].src + " -- " + res[i].dest + " == " + res[i].wt);
        }
        System.out.println("Minimum Weight of MST is : "+minWeight);
    }



}
class TestKruskalMST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            KruskalMST graph = new KruskalMST(V, E);

            for (int i = 0; i < E; i++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                int wt = sc.nextInt();
                graph.edges[i] = new KruskalMST.Edges(src, dest, wt);
            }
            graph.KruskalMST();
        }
        sc.close();
    }
}