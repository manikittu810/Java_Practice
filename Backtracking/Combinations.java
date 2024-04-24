package InterviewPrep.Backtracking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    public static List<List<Integer>> CombinationSumTwo(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backTrack(res,ans,n,k,1);
        return res;
    }
    private static void backTrack(
            List<List<Integer>> res,
            List<Integer> ans,
            int n,
            int k,
            int index
    ){
        if(ans.size() == k){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<=n;i++)
        {
            if(i>index && i-1 == i){
                continue;
            }
            ans.add(i);
            backTrack(res,ans,n,k,i+1);
            ans.remove(ans.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<List<Integer>> res = CombinationSumTwo(n,k);
            System.out.println(res);
        }
    }
}
