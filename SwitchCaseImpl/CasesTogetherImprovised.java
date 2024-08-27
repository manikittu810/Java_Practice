package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class CasesTogetherImprovised {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String month = sc.next();
            switch (month) {
                case "Jan","Feb","Mar":
                    System.out.println("Q1");
                    break;
                case "Apr","May","June":
                    System.out.println("Q2");
                    break;
                case "July","Aug","Sep":
                    System.out.println("Q3");
                    break;
                case "Oct","Nov","Dec":
                    System.out.println("Q4");
                    break;
                default:
                    System.out.println("Month did not match");
                    break;

            }
        }
    }

