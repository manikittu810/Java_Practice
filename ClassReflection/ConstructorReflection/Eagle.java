package InterviewPrep.ClassReflection.ConstructorReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Eagle {
    private Eagle(){}
    public void fly(){
        System.out.println("Eagle can fly");
    }
}
class Test{
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class eagleObj = Eagle.class;
        //to access the private constructor
        Constructor[] constructor = eagleObj.getDeclaredConstructors();
        for(Constructor eagleConstructor : constructor){
            System.out.println("Modifier" + Modifier.toString(eagleConstructor.getModifiers()));
            eagleConstructor.setAccessible(true);
            Eagle eagle = (Eagle) eagleConstructor.newInstance();
            eagle.fly();
        }
    }
}
