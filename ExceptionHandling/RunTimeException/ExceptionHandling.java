package InterviewPrep.ExceptionHandling.RunTimeException;

class ExceptionHandling{
public static void main(String[] args){
ExceptionHandling obj = new ExceptionHandling();
obj.method2();
}
public void method2(){
method3();
}
public int method3(){
return 5/0;
}
}
