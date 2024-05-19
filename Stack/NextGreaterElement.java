package InterviewPrep.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] func(int[] a,int[] b){
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : b){
            while(!st.isEmpty() && st.peek()<i){
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0;i<a.length;i++){
            a[i] = map.getOrDefault(a[i],-1);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b= new int[m];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int k=0;k<m;k++){
                b[k] =sc.nextInt();
            }
            int[] c = func(a,b);
            for(int z=0;z<n;z++){
                System.out.print(c[z]+ ",");
            }
        }
        System.out.println();
    }
}
