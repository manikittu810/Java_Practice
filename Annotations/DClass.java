package InterviewPrep.Annotations;

public class DClass {
    @Deprecated
    public void display(){
        System.out.println("Deprecated class called");
    }
}
class Test{
    public static void main(String[] args) {
        DClass obj = new DClass();
        obj.display();
    }
}