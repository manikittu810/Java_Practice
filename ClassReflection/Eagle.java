package InterviewPrep.ClassReflection;

import java.lang.reflect.Method;

public class Eagle {
    private String name;
    public int n;
    public void display(){
        System.out.println("Nothing to display");
    }
    protected  void displayNum(int n){
        System.out.println(n +" this is the number to display");
    }
    private void displayName(String s){
        System.out.println(s + "This is the name");
    }
}
class ObjectTest{
    public static void main(String[] args) throws NoSuchFieldException {
        Class obj = Eagle.class;
//        Method[] Methods=obj.getMethods();
        Method[] Methods=obj.getDeclaredMethods();
        for(Method method : Methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());

            System.out.println(method.getDeclaringClass());
            System.out.println("********");

        }
        System.out.println(obj.getName());
        System.out.println(obj.getFields());
        System.out.println(obj.getModifiers());
    }
}
