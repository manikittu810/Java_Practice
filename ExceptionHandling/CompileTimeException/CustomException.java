package InterviewPrep.ExceptionHandling.CompileTimeException;

public class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}
class Test{
    public static void main(String[] args) throws CustomException{
        try{
            method1();
        }
        catch(CustomException e){
            throw e;
        }
    }
    public static void method1() throws CustomException{
        throw new CustomException("Custom Exception Thrown");
    }
}