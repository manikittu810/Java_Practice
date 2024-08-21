package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesesMethod1 {
    public List<String> generateParantheses(int n){
        List<String> l =  new ArrayList<>();
        if(n == 0){
            return l;
        }
        backTrack(l,n,new StringBuilder(),0,0);
        return l;
    }
    private void backTrack(List<String> l,int n,StringBuilder sb,int openCount,int closedCount){

        if(sb.length() == 2*n){
            l.add(sb.toString());
            return;
        }
        if(openCount < n){
            sb.append('(');
            backTrack(l,n,sb,openCount+1,closedCount);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closedCount<openCount){
            sb.append(')');
            backTrack(l,n,sb,openCount,closedCount+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            GenerateParanthesesMethod1 obj = new GenerateParanthesesMethod1();
            System.out.println(obj.generateParantheses(n));
        }
    }
}