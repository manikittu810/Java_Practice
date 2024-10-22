package InterviewPrep.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {
    public int  smallestKthElement(int[] a, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((c,b)-> b-c);
        for (int j : a) {
            maxHeap.offer(j);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
class Main{
    public static void main(String[] args) {
        KthSmallest obj = new KthSmallest();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []a= new int[n];
            for(int j=0;j<n;j++) {
                a[j] = sc.nextInt();
            }
            System.out.println(obj.smallestKthElement(a,k));
        }
        sc.close();
    }

}