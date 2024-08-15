package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.Consumer;

//Represents an Operation, that accepts a single input parameter but returns no result
@FunctionalInterface
public interface Consumer<T>{
    void accept(T t);
}
class Test{
    public static void main(String[] args) {
    Consumer<Integer> loggingObject = (Integer t) ->{
        if(t<10){
            System.out.println(t +" less than 10");
        }
        else{
            System.out.println(t + " greater than 10");
        }
    };
    loggingObject.accept(11);
    }
}
