package InterviewPrep.Graphs.dijkstra;

import java.util.*;

class Dijkstra{
    static class Edge {
        int dest, weight;
        Edge(int d,int wt){
            this.dest =d;
            this.weight=wt;
        }
    }
    static class Node implements Comparable<Node>{
        int vertex , distance;
        Node(int v,int d){
            this.vertex = v;
            this.distance= d;
        }
        public int compareTo(Node otherNode){
            return Integer.compare(this.distance,otherNode.distance);
        }
    }
     static void dijkstra(List<List<Edge>> adjList, int src){
        int V = adjList.size();
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(distance,Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>();//log V
        distance[src] =0;
        pq.offer(new Node(src,0));
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int currentVertex = node.vertex;
            if(visited[currentVertex]) continue;
            for(Edge edge : adjList.get(currentVertex)){
                int v = edge.dest;
                if(distance[v] > distance[currentVertex]+ edge.weight){
                    distance[v] = distance[currentVertex]+edge.weight;//E-> for relax operation
                    pq.offer(new Node(v,distance[v]));
                }
            }
            visited[currentVertex] = true;
        }
         for (int i = 0; i < V; i++) {
             if (distance[i] == Integer.MAX_VALUE) {
                 System.out.println("To vertex: " + i + " -> INF");
             } else {
                 System.out.println("To vertex: " + i + " -> " + distance[i]);
             }
         }

     }

}

public class TestDijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int V = sc.nextInt();
            int E = sc.nextInt();
            List<List<Dijkstra.Edge>> adjList = new ArrayList<>();
            for(int i=0;i<V;i++){
                adjList.add(new ArrayList<>());
            }
            for(int i=0;i<E;i++){
                int src = sc.nextInt();
                int dest = sc.nextInt();
                int wt = sc.nextInt();
                adjList.get(src).add(new Dijkstra.Edge(dest,wt));
            }
            System.out.println("Enter Source Vertex : ");
            int src = sc.nextInt();
            Dijkstra.dijkstra(adjList,src);
        }
        sc.close();
    }
}
//tc =O((V+E) logV)
//sc = O(V+E) adjList and dist array