package InterviewPrep.Class.MethodsInDepth;

import java.util.Scanner;

public class Calculation {
    private static int sum(int val1,int val2){
        int tSum = val1+val2;
        System.out.println("totalSum = " + tSum);
        return tSum;
    }
    private static int ageSum(int val1,int val2){
        int tSum = sum(val1,val2);
        return tSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        ageSum(a,b);
    }

}
