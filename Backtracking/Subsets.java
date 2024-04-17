package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public static List<List<Integer>> Subset(int[] a){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backTrack(res, ans, a, 0);
        return res;
    }

    public static void backTrack(List<List<Integer>> res, List<Integer> ans, int[] a, int start){
        // Print the subset being added to res
        System.out.println("Adding subset: " + ans);
        res.add(new ArrayList<>(ans));
        for(int i = start; i < a.length; i++){
            ans.add(a[i]);
            backTrack(res, ans, a, i + 1);
            // Print the element being removed from ans
            System.out.println("Removing: " + ans.get(ans.size() - 1));
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            List<List<Integer>> subsets = Subset(a);
            System.out.println(subsets);
        }
    }
}
