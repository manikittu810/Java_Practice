package InterviewPrep.dynamicProgramming.unBoundedKnapSack.rodCuttingImpl;

import java.util.Arrays;
import java.util.Scanner;

public class RodCuttingRecursiveSolution {
    public int cutRodRecursion(int[] prices,int len){
        if(len == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for(int i =1;i<=len;i++){
            int currentMax = prices[i-1]+ cutRodRecursion(prices,len-i);
            maxProfit = Math.max(maxProfit,currentMax);
        }
        return maxProfit;
    }
    public int cutRodMemo(int[] prices,int len,int[]memo){
        if(len == 0) {
            return 0;
        }
        if(memo[len]!=-1){
            return memo[len];
        }
        int maxProfit = Integer.MIN_VALUE;
        for(int i =1;i<=len;i++){
            int currentMax = prices[i-1] + cutRodMemo(prices,len-i,memo);
            maxProfit = Math.max(maxProfit,currentMax);

        }
        memo[len] = maxProfit;
        return maxProfit;
    }
    public int rodCutTabulation(int[] price,int n ){
        int[]dp = new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] = Math.max(dp[i],price[j-1] +dp[i-j]);
            }
        }
        return dp[n];
    }
}
class TestRod{
    public static void main(String[] args) {
        RodCuttingRecursiveSolution obj = new RodCuttingRecursiveSolution();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a= new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            long t1 = System.currentTimeMillis();
            System.out.println(obj.cutRodRecursion(a,n));
            long t2 = System.currentTimeMillis();
            System.out.println("Recursion Maximum Execution time :  " + (t2-t1)+"ms");


            int []memo = new int[n+1];
            Arrays.fill(memo,-1);
            long t3 = System.currentTimeMillis();
            System.out.println(obj.cutRodMemo(a,n,memo));
            long t4 = System.currentTimeMillis();
            System.out.println("Memoization Maximum Execution time :  " + (t4-t3)+"ms");

            long t5 = System.currentTimeMillis();
            System.out.println(obj.rodCutTabulation(a,n));
            long t6 = System.currentTimeMillis();
            System.out.println("Memoization Maximum Execution time :  " + (t6-t5)+"ms");

        }
        sc.close();
    }
}