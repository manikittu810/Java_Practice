package InterviewPrep.Heap;

import java.util.Scanner;

public class MinHeap {
    int[] a;
    int size;
    int capacity;

    MinHeap(int c) {
        a = new int[c];
        capacity = c;
        size = 0;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int x) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        size++;
        a[size - 1] = x;
        int i = size - 1;
        while(i != 0 && a[i] < a[parent(i)]) {
                int temp = a[i];
                a[i] = a[parent(i)];
                a[parent(i)] = temp;
                i = parent(i);
        }
    }

    public void printHeap() {
        for(int i = 0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases : ");
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter the Capacity of the heap : ");
            int n = sc.nextInt();
            System.out.println("Enter the elements : ");
            MinHeap heap= new MinHeap(n);
            for(int k=0;k<n;k++){
                int element = sc.nextInt();
                heap.insert(element);
            }
            System.out.println("MinHeap Array : ");
            heap.printHeap();
        }
    }
}
