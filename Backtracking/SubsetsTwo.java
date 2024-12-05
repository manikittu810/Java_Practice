package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsTwo {
    public  List<List<Integer>> subsetsTwo(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        backTrack(res, ans, a, start);
        return res;
    }

    private  void backTrack(
            List<List<Integer>> res,
            List<Integer> ans,
            int[] a,
            int start
    ) {
        res.add(new ArrayList<>(ans));
        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1]) {
                continue;
            }
            ans.add(a[i]);
            backTrack(res, ans, a, i + 1);
            ans.removeLast();
        }
    }
}
class TestSubsetTwo{

    public static void main(String[] args){
        SubsetsTwo obj = new SubsetsTwo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j]= sc.nextInt();
            }
            System.out.println(obj.subsetsTwo(a));
        }
        sc.close();
    }
}
