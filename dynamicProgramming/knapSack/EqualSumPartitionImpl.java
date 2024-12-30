package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class EqualSumPartitionImpl {
    public boolean isPartition(int[]a){
        int sum = 0;
        for(int i : a)
            sum+=i;
        if(sum%2!=0){
            return false;
        }
        else{
            return tabulation(a,sum/2);
        }
    }
    private boolean tabulation(int[]a,int sum){
        int n = a.length;
        boolean[][]dp = new boolean[n+1][sum+1];
        dp[0][0] = true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j>=a[i-1]){
                    dp[i][j]= dp[i-1][j-a[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

}
class TestPartition{
    public static void main(String[] args) {
        EqualSumPartitionImpl obj = new EqualSumPartitionImpl();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[]a = new int[n];
            for(int j =0;j<n;j++){
                a[j]=sc.nextInt();
            }
            System.out.println(obj.isPartition(a));
        }
    }
}