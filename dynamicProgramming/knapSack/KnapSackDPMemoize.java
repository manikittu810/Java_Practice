package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Arrays;
import java.util.Scanner;

public class KnapSackDPMemoize {
    public int topDownKnapSack(int[]wt,int[]val,int W,int n,int[][]cache){
        if(n==0||W==0){
            return 0;
        }
        if(cache[n][W]!=-1){
            return cache[n][W];
        }
        else if(wt[n-1]<=W){
            return cache[n][W] = Math.max(val[n-1]+topDownKnapSack(wt,val,W-wt[n-1],n-1,cache),
                    topDownKnapSack(wt,val,W,n-1,cache));
        }
        else{
            return cache[n][W] = topDownKnapSack(wt,val,W,n-1,cache);
        }
    }
}
class TestMemoize{
    public static void main(String[] args) {
        KnapSackDPMemoize obj = new KnapSackDPMemoize();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int[]w = new int[n];
            int[]val = new int[n];
            for(int j=0;j<n;j++){
                System.out.println("Enter the weight of the item : ");
                w[j] = sc.nextInt();
                System.out.println("Enter the value of the item : ");
                val[j] = sc.nextInt();
            }
            System.out.println("Enter the Knapsack capacity  : ");
            int W = sc.nextInt();
            int[][] cache = new int[n+1][W+1];
            for(int[]row : cache){
                Arrays.fill(row,-1);
            }
            System.out.println(obj.topDownKnapSack(w,val,W,n,cache));
        }
    }
}