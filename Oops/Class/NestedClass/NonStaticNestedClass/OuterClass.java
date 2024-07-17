package InterviewPrep.Oops.Class.NestedClass.NonStaticNestedClass;

public class OuterClass{
    int instanceClassVariable = 10;
    static int staticClassVariable =20;
    class Nested1{
        int n1 = 1;
    }
    class Nested2 extends Nested1{
        int n2 = 3;
        public void display(){
            System.out.print("Output from inherited nested local inner class : ");
            System.out.println(instanceClassVariable + staticClassVariable + n1 + n2);
        }
    }
}
class Main{
    public static void main(String[] args){
        OuterClass obj = new OuterClass();
        OuterClass.Nested2 obj1 = obj.new Nested2();
        obj1.display();
    }
}