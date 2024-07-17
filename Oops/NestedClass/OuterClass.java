package InterviewPrep.Oops.NestedClass;

public class OuterClass {
    int instanceVariable = 20;
    static int classStaticVariable = 10;
    static class NestedClass{
        public void print(){
//            System.out.println(instanceVariable + classStaticVariable);
            System.out.println(classStaticVariable);
        }
    }
}
class Main{
    public static void main(String[] args)
    {
        OuterClass.NestedClass obj = new OuterClass.NestedClass();
        obj.print();
    }
}
//in static Nested class you can only use static variables from the outer class not the instance variables