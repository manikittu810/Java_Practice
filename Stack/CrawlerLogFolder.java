package InterviewPrep.Stack;

import java.util.Scanner;
import java.util.Stack;

public class CrawlerLogFolder {
    public static int FileCrawler(String[] s){
        Stack<String> st = new Stack<>();
        for(String w : s ){
            if(w.equals("./")){
                continue;
            }
            else if(w.equals("../")){
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                st.push(w);
            }
        }
        return st.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String[] a = new String[n];
            for(int j=0;j<n;j++){
                a[j] = sc.next();
            }
            int z = FileCrawler(a);
            System.out.print(z);
        }
        System.out.println();
    }
}
