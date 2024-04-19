package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsTwo {
    public static List<List<Integer>> subsetsTwo(int[] a){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int start =0;
        backTrack(res,ans,a,start);
        // Set<List<Integer>> s = new HashSet<>(res);
        // for(List<Integer> l : res){
        //     s.add(l);
        // }
        // List<List<Integer>> res1 = new ArrayList<>(s);
        //return res1;
        return res;
    }
    public static void backTrack(
            List<List<Integer>> res,
            List<Integer> ans,
            int[] a,
            int start
    ){
        res.add(new ArrayList<>(ans));
        for(int i=start;i<a.length;i++){
            if(i>start && a[i]==a[i-1]){
                continue;
            }
            ans.add(a[i]);
            backTrack(res,ans,a,i+1);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j]= sc.nextInt();
            }
            List<List<Integer>> res = subsetsTwo(a);
            System.out.println(res);
        }
    }
}
