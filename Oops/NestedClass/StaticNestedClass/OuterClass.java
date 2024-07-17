package InterviewPrep.Oops.NestedClass.StaticNestedClass;
public class OuterClass {
    int instanceVariable = 20;
    static int classStaticVariable = 10;
    static class NestedClass{ //This is a static nested class
        public void print(){
//            System.out.println(instanceVariable + classStaticVariable);
            System.out.println(classStaticVariable);
        }
    }
    private static class NestedClass1{ // Nested class with private access specifier
        public void print(){
            System.out.println("This is a private static class");
        }
    }
    public void display(){
    NestedClass1 obj = new NestedClass1();
        obj.print();
    }
}
class Main{
    public static void main(String[] args)
    {
        OuterClass.NestedClass obj = new OuterClass.NestedClass();
        obj.print();
        OuterClass obj1 = new OuterClass();
        obj1.display();
    }
}
//in static Nested class you can only use static variables from the outer class not the instance variables