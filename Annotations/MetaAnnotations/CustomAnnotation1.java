package InterviewPrep.Annotations.MetaAnnotations;

import java.lang.annotation.*;

import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface CustomAnnotation1 {}
@CustomAnnotation1
 class CustomAnnotation {
    public void display(){
        System.out.println("Hello");
    }
}
class T1{
    @SuppressWarnings("")
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CustomAnnotation obj =new CustomAnnotation();
        obj.display();
        Class obj1= CustomAnnotation.class;
        System.out.println(new CustomAnnotation().getClass().getAnnotation(CustomAnnotation1.class));
        Method[] methods=obj1.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
    }
}
