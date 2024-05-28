package InterviewPrep.Class;

public class Dog {
    int age;
    String breed;
    String color;
    Dog(int a,String b,String c){ //constructor is instantiated when an object is created
        age = a;
        breed = b;
        color = c;
    }

    private void setAge(int a){
        this.age = a;
    }

    private int getAge(){
        return age;
    }

    private void setBreed(String breed){
        this.breed = breed;
    }
    private String getBreed(){
        return breed;
    }

    private void setColor(String color){
        this.color = color;
    }

    private String getColor(){
        return color;
    }

    private void printDogDetails(){ //Abstraction -> Here the implementation details are hidden
        System.out.println("Dog details : age : " + getAge() + " Breed : " +getBreed()+ " Color : "+ getColor());
    }
    public static void main(String[] args){
        Dog obj = new Dog(2,"labro","golden");
        obj.printDogDetails();
        obj.setBreed("police dog");
        obj.setColor("black");
        obj.setAge(5);
        System.out.println(obj.getAge());
        System.out.println(obj.getBreed());
        System.out.println(obj.getColor());
        obj.printDogDetails();
    }
}

// Assigning the getters and setters are private - Here the code is getting Encapsulated -> Secure coding practice

// Integrity of code is Maintained.