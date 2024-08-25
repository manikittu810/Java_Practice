//package InterviewPrep.ExceptionHandling.CompileTimeException;
//
//public class ClassNotFoundException extends Throwable {
//    public static void main(String[] args) throws ClassNotFoundException{
//        method1();
//    }
//    public static void method1() throws ClassNotFoundException {
//    throw new ClassNotFoundException();
//    }
//}


//Using try/catch

//package InterviewPrep.ExceptionHandling.CompileTimeException;
//public class ClassNotFoundException extends Throwable {
//
//    public static void main(String[] args) throws ClassNotFoundException{
//        method1();
//    }
//    @SuppressWarnings("All")
//    public static void method1() throws ClassNotFoundException {
//        try{
//            throw new ClassNotFoundException();
//        } catch(ClassNotFoundException exceptionObject){
//            exceptionObject.printStackTrace();
//        }
//    }
//}

//or use this below

package InterviewPrep.ExceptionHandling.CompileTimeException;
public class ClassNotFoundException extends Throwable {

    public static void main(String[] args) throws ClassNotFoundException{
        try{
            method1();
        } catch (ClassNotFoundException e) {
            System.out.println("This is the exception object message : "+ e.getMessage());

            throw new RuntimeException(e);
        }
    }
    @SuppressWarnings("All")
    public static void method1() throws ClassNotFoundException {
            throw new ClassNotFoundException();
    }
}