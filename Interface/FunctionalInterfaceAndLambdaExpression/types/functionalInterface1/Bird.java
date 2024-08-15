package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.functionalInterface1;
@FunctionalInterface
public interface Bird {
    void canFly();
    static void isBird() {
        System.out.println("Hello isBird");
    }
    default void isFly(){
        System.out.println("Hello isFly");
    }

    String toString();

}
class Test{
    public static void main(String[] args) {
        Bird obj = new Bird(){
        @Override
        public void canFly(){
            System.out.println("Lambda Expression implementation with functional interface");
        }
        @Override
            public String toString(){
            return null;
        }
        };
        obj.canFly();
        obj.isFly();
        System.out.println(obj.toString());
        Bird.isBird();
    }

}
//Using anonymous  class