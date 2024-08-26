package InterviewPrep.ExceptionHandling.CompileTimeException;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            method1();

        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    public static  void method1(){

    }
}
