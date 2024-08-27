package InterviewPrep.SwitchCaseImpl;

import java.util.Scanner;

public class NormalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        switch(val){
            case 1 :
                System.out.println("val is 1");
                break;
            case 2 :
                System.out.println("val is 2");
                break;
            default:
                break;
        }
    }
}
