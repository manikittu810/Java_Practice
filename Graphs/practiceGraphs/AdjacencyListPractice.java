package InterviewPrep.Graphs.practiceGraphs;

import InterviewPrep.Graphs.CycleInUndirectedGraphDFS;
import InterviewPrep.Graphs.DFSUndirectedImpl;
import InterviewPrep.Graphs.ShortestPathUndirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdjacencyListPractice {
    public void printList(List<List<Integer>> l, int u , int v){
        l.get(u).add(v);
        l.get(v).add(u);
    }
}
class ListTest{
    public static void main(String[] args) {
        AdjacencyListPractice obj =  new AdjacencyListPractice();
        PrintList obj1 = new PrintList();
        BFSPractice obj2 = new BFSPractice();
        ShortestPathUndirected obj3 = new ShortestPathUndirected();
        DFSUndirectedImpl obj4 = new DFSUndirectedImpl();
        CycleInUndirectedGraphDFS obj5 = new CycleInUndirectedGraphDFS();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int v = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>(v);
            for(int j=0;j<v;j++){
                list.add(new ArrayList<>());
            }
            int edges = sc.nextInt();
            for(int k=0;k<edges;k++){
                int vertexU = sc.nextInt();
                int vertexV = sc.nextInt();
                obj.printList(list,vertexU,vertexV);
            }
            System.out.print("give the source as input for finding the Shortest Path for the current source : ");
            int source = sc.nextInt();
            obj1.printAdjacencyList(list);
            System.out.println("BFS Traversal:");
            obj2.disconnectedBFS(list,v);
            System.out.println("shortestPath Algorithm for Undirected graph with source is : " + source);
            System.out.println(Arrays.toString(obj3.findShortestPath(list, v, 0)));
            System.out.println("DFS Traversal:");
            System.out.println(obj4.DFS(list));
            System.out.print("Cycle Detection using DFS for an Undirected Graph : ");
            System.out.println(obj5.isCycleDetectedDFS(list));
        }
        sc.close();
    }
}
class PrintList{
    public void printAdjacencyList( List<List<Integer>> res){
        System.out.println("Adjacency List : ");
        for(int i=0;i<res.size();i++){
            System.out.print(i+": ");
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}