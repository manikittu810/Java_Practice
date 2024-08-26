package InterviewPrep.ExceptionHandling.CompileTimeException;

import java.util.logging.Logger;

public class MultipleExceptionsInCatchBlock {
    private static final Logger logger = Logger.getLogger(MultipleExceptionsInCatchBlock.class.getName());

    @SuppressWarnings("All")
    public static void main(String[] args) {
        //adding logger
        try{
            method1("smk");
            return;
        }
        catch(ClassNotFoundException | InterruptedException e){
            logger.severe("Exception Caught : " + e.getMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //adding finally
        finally {
            logger.info("Finally block executed");

        }
    }
    public static void method1(String s) throws ClassNotFoundException,InterruptedException{
        if(s.equals("smk")){
            throw new ClassNotFoundException();
        }
        else {
            throw new InterruptedException();
        }
    }
}
