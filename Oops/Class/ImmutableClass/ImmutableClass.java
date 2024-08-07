package InterviewPrep.Oops.Class.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

final public class ImmutableClass {
private final String name;
private final List<Object> number;

 ImmutableClass(String name,List<Object> number) {
    this.name = name;
    this.number = number;
}
public String getName(){
    return name;
}

public List<Object> getList(){
    return new ArrayList<>(number);
}
}
class ObjectTest{
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(101);
        objectList.add(102);
        ImmutableClass obj = new ImmutableClass("smk",objectList);
        System.out.println(obj.getName());
        System.out.println(obj.getList());
        obj.getList().add(103);//this is Write-only object
        obj.getList().add("hello");// Understand this , then you will understand Immutable classes.
        System.out.println(obj.getList());//object value "Hello" is not added to the original list,because
        //  it is adding the value to non - referenced copy of a list which is getting returned, if there is no reference the GC will collect it.
        //thus making the list Immutable when declared as final
        objectList.add("Hello");
        ImmutableClass obj1 = new ImmutableClass("sms",objectList);
        System.out.println(obj1.getName());
        System.out.println(obj1.getList());
    }
}
