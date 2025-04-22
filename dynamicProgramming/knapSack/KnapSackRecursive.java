package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class KnapSackRecursive {
    public int getMaxKnapSack(int[] wt,int[]val,int W,int n){
        if(n==0||W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(
                    val[n-1]+getMaxKnapSack(wt,val,W-wt[n-1],n-1),getMaxKnapSack(wt,val,W,n-1)
            );
        }
        else{
            return getMaxKnapSack(wt,val,W,n-1);
        }
    }
}

class TestKnapSack{
    public static void main(String[] args) {
        KnapSackRecursive obj = new KnapSackRecursive();
        KnapSackTabulation obj2 = new KnapSackTabulation();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []wt = new int[n];
            int []val = new int[n];
            for(int j=0;j<n;j++){
                System.out.println("Enter value of the item : ");
                val[j] = sc.nextInt();
                System.out.println("Enter weight of the item : ");
                wt[j]= sc.nextInt();
            }
            System.out.println("Enter the max capacity of the KnapSack : ");
            int W = sc.nextInt();
            System.out.println("The Max value/profit we can get from the knapsack(Recursive) is  : "+obj.getMaxKnapSack(wt,val,W,n));
            System.out.println("KnapSack Tabulation, MaxProfit is  : " + obj2.knapSackTabulation(wt,val,W));
        }
        sc.close();
    }
}