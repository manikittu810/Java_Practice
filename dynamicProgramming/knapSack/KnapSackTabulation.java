package InterviewPrep.dynamicProgramming.knapSack;

public class KnapSackTabulation {
    public int knapSackTabulation(int[]wt,int[]val,int W){
        int n = wt.length;
        int[][]dp = new int[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){

//                if(i==0 || j==0){
//                    dp[i][j]=0;
//                } //for readability and maintainability

                 if(wt[i-1]<=j){
                    dp[i][j] = Math.max(
                            val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
