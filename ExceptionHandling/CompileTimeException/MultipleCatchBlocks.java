package InterviewPrep.ExceptionHandling.CompileTimeException;

import java.io.FileNotFoundException;

public class MultipleCatchBlocks {
    @SuppressWarnings("All")
    public static void main(String[] args) {
        try{
            method2("smk");
        }
        catch(ClassNotFoundException obj){
            System.out.println("ClassNotFoundException obj : " + obj.getMessage());
            obj.printStackTrace();
        }
        catch(InterruptedException obj1){
            System.out.println("InterruptedException obj1 : " + obj1.getMessage());
            obj1.printStackTrace();
        }
//        catch(FileNotFoundException obj2){
//            obj2.printStackTrace();
//        }
    }
    public static void method2(String s) throws ClassNotFoundException,InterruptedException{
        if(s.equals("smk")){
            throw new ClassNotFoundException();
        }
        else if(s.equals("sms")){
            throw new InterruptedException();
        }
    }
}
