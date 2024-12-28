package InterviewPrep.dynamicProgramming.knapSack;

import java.util.Scanner;

public class SubSetRecursive {

    public boolean isSubSetPresent(int[]wt,int sum,int n){
        if(sum == 0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(wt[n-1]<=sum){
            return isSubSetPresent(wt,sum-wt[n-1],n-1) || isSubSetPresent(wt,sum,n-1);
        }
        else{
            return isSubSetPresent(wt,sum,n-1);
        }
    }
    public boolean isSubSetSumMemoize(int[]wt,int sum,int n,Boolean[][]memo){
        if(sum==0){
            return true;
        }
        if(n==0) return false;
        if(memo[n][sum] != null){
            return memo[n][sum];
        }
        if(wt[n-1]<=sum){
            return memo[n][sum] = isSubSetSumMemoize(wt,sum-wt[n-1],n-1,memo) ||
                    isSubSetSumMemoize(wt,sum,n-1,memo);
        }
        else{
            return memo[n][sum] =  isSubSetSumMemoize(wt,sum,n-1,memo);
        }
    }
}
class TestSubsetRecursive{
    public static void main(String[] args) {
        SubSetRecursive obj = new SubSetRecursive();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter the size of the weight array : ");
            int n = sc.nextInt();
            int []wt = new int[n];
            System.out.println("enter the weight array : ");
            for(int j=0;j<n;j++){
                wt[j] = sc.nextInt();
            }
            System.out.println("Enter the Sum : ");
            int sum = sc.nextInt();
            System.out.println("Is subset present recursive: " + obj.isSubSetPresent(wt,sum,n));
            Boolean[][] memo = new Boolean[n+1][sum+1];
            System.out.println("is SubsetSum (Memoized) present : "+ obj.isSubSetSumMemoize(wt,sum,n,memo));
        }
        sc.close();
    }
}

//TC for recursive is :O(2^n)
//TC for memoized solution is : O(n*sum)

//comparison : SC : recursive : O(n) why ? think or google pr chatgpt
//sc for memo is : O(n*sum) + O(n)
//O(n) -> recursive call stack depth  and in memo O(o*sum) ->memo Boolean 2D array