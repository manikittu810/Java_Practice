package InterviewPrep.Oops.Class.NestedClass.StaticNestedClass;
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

    class InnerClass{
        public void printThis(){
            System.out.println("From Inner class from outer class");
        }
    }
}

class OtherClass extends OuterClass.NestedClass{
    public void display1(){
        print();
    }
}
class OtherClass1 extends OuterClass.InnerClass{
    OtherClass1(){
        new OuterClass().super();
    }
    public void display1(){
        printThis();
    }
}
class Main{
    public static void main(String[] args)
    {
        OuterClass.NestedClass obj = new OuterClass.NestedClass();
        obj.print();
        OuterClass obj1 = new OuterClass();
        obj1.display();
        OtherClass objq = new OtherClass();
        objq.display1();
        OtherClass1 objw = new OtherClass1();
        objw.printThis();
    }
}
//in static Nested class you can only use static variables from the outer class not the instance variables