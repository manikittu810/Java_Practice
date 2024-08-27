package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class EnhancedSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  n = sc.nextInt();
            String op = switch(n){
                case 1 -> "one";
                case 2 -> "two";
                default -> "Default";
            };
            System.out.println(op);
        }
    }

