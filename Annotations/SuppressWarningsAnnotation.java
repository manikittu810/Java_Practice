package InterviewPrep.Annotations;

public interface SuppressWarningsAnnotation {
    @Deprecated
    void display();
}
class Impl1 implements SuppressWarningsAnnotation{
    @Deprecated
    @Override
    public void display(){
        System.out.println("Hello");
    }
}

class Test2{
    @SuppressWarnings("deprecation") // at method level
    public static void main(String[] args) {
        Impl1 obj = new Impl1();
        obj.display();
    }
}

@SuppressWarnings("all") // at class level
class Test3{
    public static void main(String[] args) {
        Impl1 obj2 = new Impl1();
        obj2.display();
    }
}