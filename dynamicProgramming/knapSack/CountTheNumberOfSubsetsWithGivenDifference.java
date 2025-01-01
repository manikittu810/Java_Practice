package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class CountTheNumberOfSubsetsWithGivenDifference {
    public int countTheSubset2(int[]a,int diff){
        int n = a.length;
        int sum =0;
        for(int i : a){
            sum+=i;
        }
        int sum1 = (diff+sum)/2;
        int[][]dp = new int[n+1][sum1+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum1;j++){
                if(j>=a[i-1]){
                    dp[i][j] = dp[i-1][j-a[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum1];
    }
}
class TestGivenDifference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountTheNumberOfSubsetsWithGivenDifference obj = new CountTheNumberOfSubsetsWithGivenDifference();
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []a= new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println("Give the required difference : ");
            int diff= sc.nextInt();
            System.out.println("The number of subsets that can be formed with the given sum is : "+obj.countTheSubset2(a,diff));
        }
        sc.close();
    }
}