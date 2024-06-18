package InterviewPrep.Oops.AbstractionImpl.AnimalPractice;

abstract class Animal{
    String color;
    abstract int legs();
    public abstract String name();

    public Animal(String color){
        this.color = color;
    }
}
class TwoLegs extends Animal{
    int legs;
    String name;

    public TwoLegs(String color,String name,int legs){
        super(color);
        this.name = name;
        this.legs= legs;
    }

    @Override
    public int legs(){
        return legs;
    }

    @Override
    public String name(){
        return name;
    }

}
class FourLegs extends Animal{
    int legs;
    String name;

    public FourLegs(String color,String name,int legs){
        super(color);
        this.name = name;
        this.legs= legs;
    }

    @Override
    public int legs(){
        return legs;
    }

    @Override
    public String name(){
        return name;
    }

}
public class TestAnimal {
    public static void main(String[] args){
        Animal two =new TwoLegs("Light brown","human",2);
        Animal four =new FourLegs("Light brown","Lion",4);

        System.out.println("Color : "+two.color + ", Name : "+ two.name() +", Legs : "+ two.legs());
        System.out.println(four.color + four.name() + four.legs());

    }

}
