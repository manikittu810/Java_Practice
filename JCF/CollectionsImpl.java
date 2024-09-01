package InterviewPrep.JCF;

import java.util.Iterator;
import java.util.Vector;
public class CollectionsImpl{
public static void main(String[] args) throws Exception{
System.out.println("Implementing vector : ");
Vector<Integer> v = new Vector<>();

for(int i =0 ;i< 10 ;i++){
v.add(i);
System.out.println("The values of v are : "+ v);
}
    System.out.println("The values present in the vector after inserting all the elements: "+ v);
Iterator<Integer> it = v.iterator();
while(it.hasNext()){
    int x = it.next();
    System.out.println("The value going to be removed from the vector is : "+x);
    it.remove();
}
    System.out.println("values in the Vector are  : " + v);
}
}
