package InterviewPrep;

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