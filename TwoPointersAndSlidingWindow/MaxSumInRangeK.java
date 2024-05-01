package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaxSumInRangeK {
    public static int maxSum(int[] a,int k){
        //version 1
//        int l=0,r=0;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        while(r<a.length){
//            sum=sum+a[r++];
//           if(r-l == k){
//               max = Math.max(max,sum);
//               sum=sum-a[l++];
//           }
//        }
//        return max;


        //version 2

        int l=0, r=k-1;
        int max = Integer.MIN_VALUE;
        while(r<a.length){
            int sum = 0;
            for(int i=l;i<=r;i++){
                sum+=a[i];
            }
            max=Math.max(max,sum);
//            sum-=a[l];
            l++;
            r++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(maxSum(a,k));
        }
    }
}
