package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class EnhancedSwitch1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  n = sc.nextInt();
            String op = switch(n){
                case 1 -> {
                   yield  "one";
                }
                case 2 -> {
                    yield "two";
                }
                default -> {
                  yield  "Default";
                }
            };
            System.out.println(op);
        }
    }