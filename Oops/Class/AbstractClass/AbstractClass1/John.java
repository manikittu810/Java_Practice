package InterviewPrep.Oops.Class.AbstractClass.AbstractClass1;

public abstract class John {
    public abstract void ImplementThis();
}
class ObjectTest{
    public static void main(String[] args) {
        John obj = new John(){
            @Override
            public void ImplementThis(){
                System.out.println("Hello from Anonymous inner class");
            }
        };
        obj.ImplementThis();
    }
}
