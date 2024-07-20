package InterviewPrep.Oops.Class.MultiBound;

public class ParentClass {
    public void method1(){
        System.out.println("Menthod1 Parent class");
    }
}
interface interface1{
    public void method2();
}
interface interface2{
    public void method3();
}
class A extends ParentClass implements interface1,interface2{
   @Override
    public void method2(){
       System.out.println("Method2 implemented in class A");
   }
    @Override
    public void method3(){
        System.out.println("Method3 implemented in class A");
    }
}
class Print<T extends ParentClass & interface2 & interface1>{
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}
class ObjectTest{
    public static void main(String[] args) {
        A obj = new A();
        Print<A> objA = new Print<>();
        objA.setT(obj);
        A obj1 = objA.getT();
        obj1.method2();
        obj1.method3();
        obj1.method1();
    }
}
