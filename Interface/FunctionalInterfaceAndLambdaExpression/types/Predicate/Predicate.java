package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.Predicate;
//Accepts any parameter type , but returns boolean
@FunctionalInterface
public interface Predicate<T> {
    boolean predicateImpl(T t);
}
class Test1{
    public static void main(String[] args) {
        Predicate<Integer> obj = (Integer t) ->{
            if(t%2 == 0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(obj.predicateImpl(11));
    }
}
