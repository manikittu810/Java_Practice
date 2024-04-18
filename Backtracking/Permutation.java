package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
public static List<List<Integer>> GeneratePermutation(int []a){
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    boolean[] used = new boolean[a.length];
    backTrack(res, ans, a, used);
    return res;
}
public static void backTrack(
        List<List<Integer>> res,
        List<Integer> ans,
        int[] a,
        boolean[] used
){
if(ans.size()==a.length){
    res.add(new ArrayList<>(ans));
    return;
}
for(int i=0;i<a.length;i++){
    if(!used[i]){
    ans.add(a[i]);
    used[i] = true;
    backTrack(res,ans,a,used);
    ans.remove(ans.size()-1);
    used[i] = false;
    }

}
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    for(int i=0;i<t;i++){
        int n = sc.nextInt();
        int []a = new int[n];
        for(int j=0;j<n;j++){
            a[j] = sc.nextInt();
        }
        List<List<Integer>> res = GeneratePermutation(a);
        System.out.println(res);

    }
}

}
