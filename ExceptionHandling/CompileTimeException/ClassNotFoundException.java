package InterviewPrep.ExceptionHandling.CompileTimeException;

public class ClassNotFoundException extends Throwable {
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
    }
    public static void method1() throws ClassNotFoundException {
    throw new ClassNotFoundException();
    }
}