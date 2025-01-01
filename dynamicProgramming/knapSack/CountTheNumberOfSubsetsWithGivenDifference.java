package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class CountTheNumberOfSubsetsWithGivenDifference {
    public int countTheSubset2(int[]a,int diff){
        int n = a.length;
        int sum =0;
        for(int i : a){
            sum+=i;
        }
        if((sum+diff)%2!=0){
            return 0;
        }
        int sum1 = (diff+sum)/2;
//        int[][]dp = new int[n+1][sum1+1];
//        dp[0][0]=1;
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=sum1;j++){
//                if(j>=a[i-1]){
//                    dp[i][j] = dp[i-1][j-a[i-1]]+dp[i-1][j];
//                }
//                else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        return dp[n][sum1];
        //the below is space optimized 1D dp sc : O(sum1+1)
        int[]dp = new int[sum1+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=sum1;j>=a[i];j--){
                dp[j]+=dp[j-a[i]];
            }
        }
        return dp[sum1];
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

//Input: arr[] =  [5, 2, 6, 4], d = 3
//Output: 1
//Explanation: There is only one possible partition of this array. Partition : {6, 4}, {5, 2}.
// The subset difference between subset sum is: (6 + 4) - (5 + 2) = 3.
