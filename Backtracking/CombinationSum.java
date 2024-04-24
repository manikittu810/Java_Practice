package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {

        public static List<List<Integer>> combinationSum(int[] a, int target) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> ans  = new ArrayList<>();
            int start = 0;
            int sum = 0;
            backTrack(res,ans,a,start,target, sum);
            return res;

        }
        public static void backTrack(
                List<List<Integer>> res,
                List<Integer> ans,
                int[] a,
                int start,
                int target,
                int sum
        ){
            if(sum > target){
                return ;
            }
            if(sum == target) {
                res.add(new ArrayList<>(ans));
                return;
            }
            for(int i=start;i<a.length;i++){
            ans.add(a[i]);
            sum+=a[i];
            backTrack(res,ans,a,i,target,sum);
            ans.remove(ans.size()-1);
            sum-=a[i];
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                int[] a = new int[n];
                int tar = sc.nextInt();
                for(int j=0;j<n;j++){
                    a[j] = sc.nextInt();
                }
                List<List<Integer>> res = combinationSum(a,tar);
                System.out.println(res);
            }
        }


}
