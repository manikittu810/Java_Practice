package InterviewPrep.Graphs;
import java.util.*;

public class BFSDisconnectedAndSourceNotGiven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int v= sc.nextInt();
            int e = sc.nextInt();
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            for(int j = 0;j<v;j++){
                res.add(new ArrayList<>());
            }
            for(int k = 0;k<e;k++){
                int from  = sc.nextInt();
                int to = sc.nextInt();
                res.get(from).add(to);
                res.get(to).add(from);
            }
            BFSNoSource(res,v);
        }
    }

    private static void BFSNoSource(ArrayList<ArrayList<Integer>> res, int v) {
        boolean[] visited = new boolean[v+1];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                visited[i] = true;
                BFSImpl(res,i,visited);
            }
        }
    }

    private static void BFSImpl(ArrayList<ArrayList<Integer>> res, int i,boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[i] = true;
        q.add(i);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int j : res.get(u)){
                if(!visited[j]){
                    visited[j] = true;
                    q.add(j);
                }
            }
        }
    }
}
