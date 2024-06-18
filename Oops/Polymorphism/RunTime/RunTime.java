package InterviewPrep.Oops.Polymorphism.RunTime;

class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class RunTime {
    public static void main(String[] args){
        Animal obj;
        obj = new Dog();
        obj.sound();






    }
}
