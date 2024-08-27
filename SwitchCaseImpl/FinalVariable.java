package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class FinalVariable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            final int val1 = 3;
            switch(val){
                case 1 :
                    System.out.println("val is 1");
                    break;
                case 2 :
                    System.out.println("val is 2");
                    break;
                case val1:
                    System.out.println("val is :" + val);
                    break;
                default:
                    break;
            }
        }
    }