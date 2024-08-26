package InterviewPrep.ExceptionHandling.CompileTimeException;

public class SomeExample {
    public static void main(String[] args) {
       method1(5,0);
        method1(5,1);

    }
    public static void method1(int a , int b){
        int val;
        try{
            val = a/b;
        }
        catch(ArithmeticException e){
            val =-1;
        }
        System.out.println(val);
    }
}


//instead we write the code as ->

//public int method(int a, int b){
//    if(b==0)
//    {
//    return -1;
//    }
//    val = a/b;
//    return val;
//}