package InterviewPrep.JCF;

import java.util.Arrays;

public class ComparatorImpl {
    public static void main(String[] args) {
        Integer[] a = {100, -100, 9, 900, 78, -1232432423, 9490934};

        Arrays.sort(a);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(a,(Integer v1,Integer v2) -> v2-v1);
        for(int i : a) {
            System.out.print(i + " ");
        }
    }
}