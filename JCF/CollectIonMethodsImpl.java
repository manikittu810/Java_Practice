package InterviewPrep.JCF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectIonMethodsImpl {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);


        System.out.println("Size   :" + l.size());
        System.out.println("contains : " +  l.contains(5) );
        System.out.println("IsEmpty :" + l.isEmpty() );
        l.add(5);
        System.out.println("contains :" +  l.contains(5) );
        l.remove(3);
        System.out.println("Removed using Index  :" +  l.contains(5) );
        //remove using the object , remove the first occurrence of value
        l.remove(Integer.valueOf(3));
        System.out.println("removed using object :" +  l.contains(3) );

        Stack<Integer> st = new Stack<>();
        st.add(6);
        st.add(7);
        st.add(8);

        l.addAll(st); // adding all the values of stack into a list, l.

        System.out.println("adAll() test using containsAll : " + l.containsAll(st));

        l.remove(Integer.valueOf(7));//7 removed from list
        System.out.println("adAll() test using containsAll : " + l.containsAll(st));

        l.removeAll(st);
        System.out.println("removeAll : "+l.contains(8));
        l.clear();
        System.out.println("Cleared the list : " + l);









    }
}
