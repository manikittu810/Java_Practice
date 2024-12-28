package InterviewPrep.dynamicProgramming.knapSack;

public class SubSetSumTabulation {
    public boolean tabulationSubSetSum(int[]wt,int sum,int n){
        boolean [][]dp = new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<=sum;i++){
            dp[0][i] = false;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = (dp[i-1][j-wt[i-1]] || dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
