package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types;

@FunctionalInterface
public interface FunctionalInterfaceImpl {
    void display();
}

class Impl implements FunctionalInterfaceImpl{

    public void display(){
        System.out.println("Functional Interface Implemented");
    }
}
class Test{
    public static void main(String[] args) {
        FunctionalInterfaceImpl obj = new Impl();
        obj.display();
    }
}