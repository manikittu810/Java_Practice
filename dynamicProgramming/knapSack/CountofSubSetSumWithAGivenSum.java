package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class CountofSubSetSumWithAGivenSum {
    public int countSubSets(int[]a ,int sum){
        int n = a.length;
        int[][]dp = new int[n+1][sum+1];
        dp[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j>=a[i-1]){
                    dp[i][j] = dp[i-1][j-a[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
class TestFunction{
    public static void main(String[] args) {
        CountofSubSetSumWithAGivenSum obj = new CountofSubSetSumWithAGivenSum();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[]a = new int[n];
            for(int j=0;j<n;j++){
                a[j]= sc.nextInt();
            }
            int W = sc.nextInt();
            System.out.println(obj.countSubSets(a,W));
        }
    }
}
