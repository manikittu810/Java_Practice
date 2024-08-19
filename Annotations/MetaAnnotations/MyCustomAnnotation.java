package InterviewPrep.Annotations.MetaAnnotations;

import java.lang.annotation.*;

@Documented
//@Retention(RetentionPolicy.SOURCE) // returns null if declared source
    
@Retention(RetentionPolicy.RUNTIME) // returns Custom annotation name id declare RUNTIME
    
//@Retention(RetentionPolicy.CLASS)
    
@Target(ElementType.TYPE)
public @interface MyCustomAnnotation{}

@MyCustomAnnotation
class MetaAnnotationsImpl{}
class Main{
    public static void main(String[] args) throws NoSuchMethodException{
        System.out.println(new MetaAnnotationsImpl().getClass().getAnnotation(MyCustomAnnotation.class));
    }
}
