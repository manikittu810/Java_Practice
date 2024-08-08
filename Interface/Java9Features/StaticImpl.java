package InterviewPrep.Interface.Java9Features;

public interface StaticImpl {
    void display();
    default void methods(){
        myPrivateMethod0();//static method;
        myPrivateMethod1();//just private method
        myPrivateMethod2();//private static method
    }
    static void myPrivateMethod0(){ // can only implement/access  static methods or variables
        System.out.println("hello from private myPrivateMethod0 - static method");
        myPrivateMethod2();// we can call other static methods only
    }
    private void myPrivateMethod1(){//Need to implement any private method inside the class itself.
        System.out.println("hello from private myPrivateMethod1 - only private method");
    }
    private static void myPrivateMethod2(){//private static method should also
        // be implemented inside the class.
        System.out.println("hello from private myPrivateMethod2 - private static method");
    }
}
class Impl implements StaticImpl{
    public void display(){
        System.out.println("display Method implemented in class");
    }

}
class Test{
    public static void main(String[] args) {
        StaticImpl obj = new Impl();
        obj.display();
        obj.methods();
    }
}