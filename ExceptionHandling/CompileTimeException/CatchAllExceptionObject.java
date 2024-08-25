package InterviewPrep.ExceptionHandling.CompileTimeException;

public class CatchAllExceptionObject {
    @SuppressWarnings("All")
    public static void main(String[] args) {
        try{
            method2("sms");
        }
//        catch (Exception obj3){//you can declare the Exception(come's first in Hierarchy) declared after
//            //other catch blocks are implemented
//            System.out.println("Exception obj3 message: " + obj3.getMessage());
//            obj3.printStackTrace();
//
//        }
        //After Declaring the Exception in catch block you cannot implement any other catch blocks.

        //-------------------------------------------------------------------
        catch(ClassNotFoundException obj){
            System.out.println("ClassNotFoundException obj : " + obj.getMessage());
            obj.printStackTrace();
        }
        catch(InterruptedException obj1){
            System.out.println("InterruptedException obj1 : " + obj1.getMessage());
            obj1.printStackTrace();
        }
        catch (Exception obj3){//you can declare the Exception(come's first in Hierarchy) declared after
            //other catch blocks are implemented
            System.out.println("Exception obj3 message: " + obj3.getMessage());
            obj3.printStackTrace();

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
