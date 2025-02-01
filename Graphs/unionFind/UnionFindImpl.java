package InterviewPrep.Graphs.unionFind;

import java.util.Scanner;

public class UnionFindImpl {
    private final int[] parent;
    private final int[] rank;
    UnionFindImpl(int n ) {
        parent = new int[n+1];
        rank = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x){
        if(parent[x] ==x){
            return parent[x];
        }
        parent[x] = find(parent[x]);
        return parent[x];//path compression
    }

    void union(int x,int y){
        int xParent = find(x);
        int yParent = find(y);
        if(xParent==yParent){
            System.out.println("Elements " + x + " and " + y + " are already connected.");
            return ;
        }
        if(rank[xParent]<rank[yParent]){
            parent[xParent] = yParent;
        }else if(rank[xParent]>rank[yParent]){
            parent[yParent] = xParent;
        }
        else{
            parent[yParent] = xParent;
            rank[xParent]++;
        }
        System.out.println("Union completed: " + x + " -> " + y);
    }
    void printParentArray(){
        System.out.println("Printing Parent array : ");
        for(int i=1;i<parent.length;i++) System.out.println(i + "'s parent is : " + parent[i]);
        System.out.println();
    }

}
class TestUnionFindImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            UnionFindImpl obj = new UnionFindImpl(n);

            System.out.println("Enter number of union operations : ");
            int unionOps = sc.nextInt();
            for(int i=0;i<unionOps;i++){
                int y = sc.nextInt();
                int z = sc.nextInt();
                obj.union(y,z);
            }

            System.out.println("Enter number of find operations : ");
            int findOps = sc.nextInt();
            for(int i=0;i<findOps;i++){
                int x = sc.nextInt();
                obj.find(x);
            }
            obj.printParentArray();
        }
        sc.close();
    }
}