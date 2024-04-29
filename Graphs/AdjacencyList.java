package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void AdjacenyL(ArrayList<ArrayList<Integer>> res,int u, int v) {
        res.get(u).add(v); // since it is an undirected graph here i'm inserting v at u and u at u such that the graph is undirectional and both the vertices map each other
        res.get(v).add(u);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//test cases
        for(int j=0;j<t;j++) {
            int v = sc.nextInt();
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(v);// inserting v is optional
            //now main arraylist is empty , now we add 'v' arraylists to the empty arraylist.
            for(int i=0;i<v;i++) {
                res.add(new ArrayList<Integer>());//[[],[],[],[]]
            }
            for(int k=0;k<v;k++){
                int u = sc.nextInt();
                int w= sc.nextInt();
               AdjacenyL(res,u,w);
            }
            printAdjacencyList(res);
        }
        }

    private static void printAdjacencyList(ArrayList<ArrayList<Integer>> res) {
        for(int i=0;i<res.size();i++){
            System.out.print(i + " : ");
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
