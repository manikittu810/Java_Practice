package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

/*
Given an array arr[]  containing non-negative integers,
the task is to divide it into two sets set1 and
set2 such that the absolute difference between their
sums is minimum and find the minimum difference.

Examples:

Input: arr[] = [1, 6, 11, 5]
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12
Subset2 = {11}, sum of Subset2 = 11
Hence, minimum difference is 1.


Input: arr[] = [1, 4]
Output: 3
Explanation:
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {4}, sum of Subset2 = 4
Hence, minimum difference is 3.


Input: arr[] = [1]
Output: 1
Explanation:
Subset1 = {1}, sum of Subset1 = 1
Subset2 = {}, sum of Subset2 = 0
Hence, minimum difference is 1.


Constraints:
1 ≤ arr.size()*|sum of array elements| ≤ 105
1 <= arr[i] <= 105
 */
public class MinSumPartition {
    public int minSumSet(int[]a){
        int sum =0;
        for(int i : a){
            sum+=i;
        }
        return tabulation(a,sum);
    }
    private int tabulation(int[]a,int totalSum){
        int n = a.length;
        boolean[][]dp = new boolean[n+1][totalSum+1];
        dp[0][0]=true;
        for(int i =1;i<=n;i++){
            for(int j=0;j<=totalSum;j++){
                if(j>=a[i-1]){
                    dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];//consider the subset
                }
                else{
                    dp[i][j] = dp[i-1][j];//do not consider the subset
                }
            }
        }

        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<=totalSum/2;i++){
            if(dp[n][i]){
                minVal = Math.min(minVal,Math.abs(totalSum-2*i));
            }
        }
        return minVal;
    }
}
class TestMinSumPartition{
    public static void main(String[] args) {
        MinSumPartition obj = new MinSumPartition();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[]a = new int[n];
            for(int j =0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(obj.minSumSet(a));
        }

    }
}