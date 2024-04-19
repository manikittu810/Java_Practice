package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartition {
    public static List<List<String>> palindromePartition(String s){
        List<List<String>> res =new ArrayList<>();
        List<String> ans = new ArrayList<>();
        backtrack(res,ans,s,0);
        return res;
    }

    public static void backtrack(
            List<List<String>>res, List<String> ans, String s, int start
    ){
        if(start>=s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int end = start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                ans.add(s.substring(start,end+1));
                backtrack(res,ans,s,end+1);
                ans.remove(ans.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s , int low, int high){
        while(low<high){
            if(s.charAt(low++)!=s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            String s = sc.next();
            List<List<String>> res = palindromePartition(s);
            System.out.println(res);
        }
    }
}
