package InterviewPrep.Heap.topKElements;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {
    public int functionImpl(int []a,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((c,b) -> b-c);
        for(int i=0;i<a.length;i++){
            pq.offer(a[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

}
class Main{
    public static void main(String[] args) {
        KthSmallest kthSmallest = new KthSmallest();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//inputting number of test cases
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();//inputting size
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();//inputting array elements
            }
            int ans = kthSmallest.functionImpl(a,k);
            System.out.println("The k=" + k +" (kth) smallest element is : " + ans);
        }

        sc.close();
    }
}
