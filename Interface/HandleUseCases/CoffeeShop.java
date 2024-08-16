package InterviewPrep.Interface.HandleUseCases;

@FunctionalInterface
public interface CoffeeShop {
    void display();
}
interface Hazlenut extends CoffeeShop{
    boolean isCoffee();
}
class Test1{
    public static void main(String[] args) {
        CoffeeShop obj = () -> System.out.println("This is Coffee");
        obj.display();
        Hazlenut obj1 = new Hazlenut() {
            @Override
            public boolean isCoffee() {
                return false;
            }

            @Override
            public void display() {
                System.out.println("display Overrided here");
            }
        };
        System.out.println(obj1.isCoffee());
        obj1.display();

    }
}
