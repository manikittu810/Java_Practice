package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combinationSumTwo {
    public static List<List<Integer>> combinationTwo(int[] a, int target){
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int sum=0,start=0;
        backTrack(res,ans,a,target,sum,start);
        return res;
    }
    public static void backTrack(
            List<List<Integer>> res,
            List<Integer> ans,
            int[] a,
            int target,
            int sum,
            int start
    ){
        if(sum>target){
            return ;
        }
        if(sum==target){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=start;i<a.length;i++){
            if(i>start && a[i]==a[i-1]){
                continue;
            }
            ans.add(a[i]);
            sum+=a[i];
            backTrack(res,ans,a,target,sum,i+1);
            ans.remove(ans.size()-1);
            sum-=a[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] a= new int[n];
            for(int j=0;j<a.length;j++){
                a[j] = sc.nextInt();
            }
            List<List<Integer>> res = combinationTwo(a,target);
            System.out.println(res);
        }
    }
}
