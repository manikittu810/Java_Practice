package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.Function;
//Represents Function, accepts one argument, processes it and produces a result
// T->parameter type, R->Result
@FunctionalInterface
public interface Function <T,R>{
    R func(T t);
}

class Test{
    public static void main(String[] args) {
        Function<String, Integer> obj = (String s) ->{
            int n = Integer.parseInt(s);
            n+=100;
            return n;
        };
        System.out.println(obj.func("200"));
    }
}