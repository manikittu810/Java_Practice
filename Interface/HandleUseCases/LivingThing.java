package InterviewPrep.Interface.HandleUseCases;

public interface LivingThing {
    default void canBreathe(){
        System.out.println("Hello from Non functional Interface");
    }
}
@FunctionalInterface
interface Human extends LivingThing{
    void cannotBreathe();
}
class Test2{
    public static void main(String[] args) {
        Human obj = () -> System.out.println("Functional Interface executed -> human Breathes");
        obj.cannotBreathe();
        obj.canBreathe();
    }
}
