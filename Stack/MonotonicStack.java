package InterviewPrep.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class MonotonicStack {
    public static int[] Discount(int[] a){
//        Deque<Integer> st = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[st.peek()] >=a[i]){
                int index = st.pop();
                ans[index] = a[index] -a[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int index = st.pop();
            ans[index] = a[index] ;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            int[] res = Discount(a);
            for(int price : res){
                System.out.print(price + " ");
            }
            System.out.println();
        }
    }
}
