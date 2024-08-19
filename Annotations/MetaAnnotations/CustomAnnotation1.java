package InterviewPrep.Annotations.MetaAnnotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnnotation1 {}
@CustomAnnotation1
 class CustomAnnotation {
    void display(){
        System.out.println("Hello");
    }
}
class T1{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CustomAnnotation obj =new CustomAnnotation();
        obj.display();
    }
}
