package InterviewPrep.Interface.HandleUseCases;

@FunctionalInterface
public interface Bird<T,R> {
    R breathes(T t);
}
@FunctionalInterface
interface Eagle<T,R> extends Bird<T,R>{
    R breathes(T t);
}
class Test{
    public static void main(String[] args) {
        Bird<String, Boolean> obj =  (String s) ->  s.equals("yes");

        System.out.println(obj.breathes("yes"));
        System.out.println(obj.breathes("No"));

        Eagle<String, Boolean> obj1 =  (String s) -> s.equals("yes");
        System.out.println(obj1.breathes("yes"));
        System.out.println(obj1.breathes("No"));

    }
}
