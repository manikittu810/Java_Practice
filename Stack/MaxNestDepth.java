package InterviewPrep.Stack;

import java.util.Scanner;
import java.util.Stack;

public class MaxNestDepth {
    public static int fun(String s){
        Stack<Character> st = new Stack<>();
        int count =0;
        for(Character c : s.toCharArray()){
            if(c=='('){
                st.push(c);
                count = Math.max(count,st.size());
            }
            else {
                if(!st.isEmpty() && st.peek()=='(' && c==')'){
                    st.pop();
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            int n = fun(s);
            System.out.print(n);
        }
        System.out.println();
        sc.close();
    }
}
