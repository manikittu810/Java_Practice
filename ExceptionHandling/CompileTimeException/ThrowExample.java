package InterviewPrep.ExceptionHandling.CompileTimeException;

public class ThrowExample {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            method1();
        }
        catch(ClassNotFoundException e){
            throw e;
        }
    }
    public static void method1() throws ClassNotFoundException{
    throw new ClassNotFoundException();
    }
}
