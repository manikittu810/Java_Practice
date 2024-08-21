package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GenerateParantheseUsingStack {
    protected List<String> l = new ArrayList<>();
    protected Stack<Character> st = new Stack<>();

    public List<String> generateParantheses(int n) {
        backTrack(n, 0, 0);
        return l;
    }

    private void backTrack(int n, int openCount, int closedCount) {
        if (closedCount == openCount && closedCount == n) {
            StringBuilder sb = new StringBuilder();
            for (Character ch : st) {
                sb.append(ch);
            }
            l.add(sb.toString());
            return;
        }
        if (openCount < n) {
            st.push('(');
            backTrack(n, openCount + 1, closedCount);
            st.pop();
        }
        if (closedCount < openCount) {
            st.push(')');
            backTrack(n, openCount, closedCount + 1);
            st.pop();
        }
    }
}
class Test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
           GenerateParantheseUsingStack obj = new GenerateParantheseUsingStack();
            System.out.println(obj.generateParantheses(n));
        }
    }
}