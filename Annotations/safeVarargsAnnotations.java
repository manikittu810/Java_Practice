package InterviewPrep.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class safeVarargsAnnotations {
    @SafeVarargs
    public static void logValues(List<Integer>... logNumbersList) {
        Object[] obj = logNumbersList;
        List<String> s= new ArrayList<>();
        s.add("hello");
        obj[0] = s; // object of one TYPE storing the REFERENCE of another TYPE.
        /* ((Object[]) logNumbersList)[0] = s; */
    }
}
//Need to complete Main methods as well

//Heap Pollution -> object of one TYPE storing the REFERENCE of another TYPE.