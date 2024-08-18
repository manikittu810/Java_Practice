package InterviewPrep.Annotations;

public interface OverridenAnnotation {
    void display();
}
class Impl implements OverridenAnnotation{
    @Override
    public void display(){
        System.out.println("Class implementing the interface method by overriding");
    }
}
class Test1{
    public static void main(String[] args) {
        Impl obj = new Impl();
        obj.display();
    }
}