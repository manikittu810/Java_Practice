package InterviewPrep.Interface.DefaultInInterface;

public interface Bird {
    default boolean canBreathe(){
        return true;
    }
}
interface Something extends Bird{
     default boolean canBreathe(){
        System.out.println("from child interface extending both classes");
        return true;
    }
}
class SomethingDiff implements Something,Bird{
    public boolean canBreathe(){
        System.out.println("In class now");
        return true;
    }
}
//Observe this another default method implementation  below
interface Impl{
    default void impl(){
        System.out.println("In Interface");
    }
}
interface Impl3 extends Impl{

}
class Impl2 implements Impl{
    public void impl(){
    System.out.println("In class Impl2 which implements Impl");
}
}
class Impl4 implements Impl3{
    public void impl(){
        System.out.println("In class Impl4 which implements Impl3");
    }
}
//

interface B1{
    default void sys1(){
        System.out.println("Sys1");
    }
}
interface B2 extends B1{
    void sys1();
}
class B3 implements B2{
    public void sys1(){
        System.out.println("In class B3");
    }
}
class Test{
    public static void main(String[] args) {
        Bird obj = new SomethingDiff();
        obj.canBreathe();

        Something obj1 = new SomethingDiff();
        obj1.canBreathe();


        Impl obj3 = new Impl2();
        obj3.impl();

        Impl3 obj4 = new Impl4();
        obj4.impl();

        B2 obj5 = new B3();
        obj5.sys1();
    }
}
