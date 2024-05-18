package InterviewPrep.Stack;

import java.util.Scanner;
import java.util.Stack;

public class MakeTheStringGreat {

    public static String Great(String s){
        Stack<Character> st= new Stack<>();
        char[] ch =s.toCharArray();
        for(Character c : ch){
            if(!st.isEmpty() && Math.abs(st.peek()-c)==32){
                st.pop();
            }
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            String st = Great(s);
            System.out.print(st);
        }
        System.out.println();
    }
}

//testcase:
//        1
//        LeEeetcode