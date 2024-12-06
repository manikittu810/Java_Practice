package InterviewPrep.Graphs;

import java.util.ArrayList;
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int v = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>(v);
            for(int j=0;j<v;j++){
                list.add(new ArrayList<>());
            }
            for(int k=0;k<v;k++){
                int vertexU = sc.nextInt();
                int vertexV = sc.nextInt();
                obj.printList(list,vertexU,vertexV);
            }
            obj1.printAdjacencyList(list);
        }
        sc.close();
    }
}
class PrintList{
    public void printAdjacencyList( List<List<Integer>> res){
        for(int i=0;i<res.size();i++){
            System.out.print(i+": ");
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}