package InterviewPrep.JCF;

import java.util.*;

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


//Using ForEach method and for-n each loop
    List<Integer> l =  new ArrayList<>();
    for(int i =10 ;i>=-10;i--){
        l.add(i);
    }
    System.out.println("values in the list are  : " + l);
    System.out.println("Printing all the values using the for each loop : ");

    l.forEach((Integer x) -> System.out.println(x));


    int size = l.size();
    ListIterator<Integer> it1 = l.listIterator(size);
   while(it1.hasPrevious()){
       int val2 = it1.previous();
       if(val2 == -6){
           it1.set(-100);
       }
       System.out.println("Value going to removed is :" + it1.next());
       it1.remove();
   }
    System.out.println(l);
}
}
