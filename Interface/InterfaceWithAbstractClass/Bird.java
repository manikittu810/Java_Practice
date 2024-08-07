package InterviewPrep.Interface.InterfaceWithAbstractClass;


public interface Bird {
    void Method1();
    void Method2();
}

class Test{
    public static void main(String[] args) {
        Bird obj = new Smk();
        Eagle obj1 = new Smk();
        obj.Method1();
        obj.Method2();
        obj1.Method3();
    }
}