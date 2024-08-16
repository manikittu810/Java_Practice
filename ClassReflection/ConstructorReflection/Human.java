package InterviewPrep.ClassReflection.ConstructorReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Human {
    Human(){

    }
    public void eat(int intParam, boolean booleanParam,String stringParam){
        System.out.println("fly intParam : " + intParam + " boolParam : "+ booleanParam + " strParam : " + stringParam);
    }
}
class ObjectTest{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class obj = Human.class;
        Object obj2 = obj.newInstance();
        Method eatMethod = obj.getMethod("eat",int.class,boolean.class,String.class);
        eatMethod.invoke(obj2,1,true,"Hello");

    }

}