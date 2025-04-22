package InterviewPrep.Sorting;

import java.util.Scanner;

public class MergeSort {
    public void mergeSort(int[]a){
        if(a.length<=1){
            return;
        }
        int mid = a.length/2;
        int[]left = new int[mid];
        int[]right = new int[a.length-mid];

        System.arraycopy(a,0,left,0,mid);
        System.arraycopy(a,mid,right,0,a.length-mid);

        mergeSort(left);
        mergeSort(right);
        merge(left,right,a);
    }
    private void merge(int[]left,int[]right,int[]a){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                a[k++] = left[i++];
            }else {
                a[k++] =right[j++];
            }
        }
        while (i<left.length){
            a[k++] = left[i++];
        }
        while(j<right.length){
            a[k++] =right[j++];
        }
    }
}
class TestMergeSort{
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int j : a){
                System.out.print(j+" ");
            }
            System.out.println();
            obj.mergeSort(a);
            for(int j : a){
                System.out.print(j+" ");
            }
        }
        sc.close();
    }
}
