package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class CasesTogether {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String month = sc.next();
            switch (month) {
                case "Jan":
                case "Feb":
                case "Mar":
                    System.out.println("Q1");
                    break;
                case "Apr":
                case "May":
                case "June":
                    System.out.println("Q2");
                    break;
                case "July":
                case "Aug":
                case "Sep":
                    System.out.println("Q3");
                    break;
                case "Oct":
                case "Nov":
                case "Dec":
                    System.out.println("Q4");
                    break;
                default:
                    System.out.println("Month did not match");
                    break;

            }
        }
    }
