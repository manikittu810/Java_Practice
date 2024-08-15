package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.Supplier;
//Accepts no parameter , produces a result;
@FunctionalInterface
public interface Supplier<T> {
    T supply();
}
class Test{
    public static void main(String[] args) {
        Supplier<String> obj = () -> "Prints this";
        System.out.println(obj.supply());
        Supplier<String> obj1 = () -> {
            return "this is also line";
        };
        System.out.println(obj1.supply());
    }
}
