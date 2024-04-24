package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PermutationsTwo {
    public static List<List<Integer>> PermutationDuplicate(int[] a){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[a.length];
        Arrays.sort(a);
        backtrack(res,ans,a,used);
        return res;

    }
    private static void backtrack(
            List<List<Integer>> res,
            List<Integer> ans,
            int[] a,
            boolean[] used
    ){
        if(a.length==ans.size()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!used[i]){
                if(i>0 && a[i-1] == a[i] && !used[i-1]){
                    continue;
                }
                ans.add(a[i]);
                used[i] = true;
                backtrack(res,ans,a,used);
                ans.remove(ans.size()-1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            List<List<Integer>> res = PermutationDuplicate(a);
            System.out.println(res);
        }

    }
}
