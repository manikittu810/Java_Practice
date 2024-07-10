package InterviewPrep.RandomMethods;

public class Child3 extends Parent {
    private String weight;

    public Child3(String color, String nationality, int age,String weight) {
        super(color, nationality, age);
        this.weight = weight;
    }
    protected String getWeight(){
        return weight;
    }
    @Override
    protected void printDetails() {
        System.out.println("Child3 details : Hair Color : " + getColor() + " Nationality : " + getNationality() + " child2 Age : " + getAge() + " Weight : " + getWeight());
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent("Brown", "Indian", 25);
        Child1 obj2 = new Child1("Black", "Nepal", 45, "Nepali");
        Child2 obj3 = new Child2("Brown", "Indian", 25, "Telugu", "5-7");
        Child3 obj4 = new Child3("Blonde","Lanka",27,"65 kg");

        System.out.println(obj1.getColor());
        System.out.println(obj2.getLanguage());
        System.out.println(obj3.getHeight());
        System.out.println(obj4.getWeight());



        obj1.printDetails();
        obj2.printDetails();
        obj3.printDetails();
        obj4.printDetails();

        obj2.setNationality("Telanagana");
        obj3.setColor("Grey");
        obj1.setAge(98);
        obj4.setAge(203);
        obj1.printDetails();
        obj2.printDetails();
        obj3.printDetails();
        obj4.printDetails();
    }

}

//this code demonstrates -> Multilevel,Hierarchical Inheritance
// Encapsulation : Controlled access of properties through getter methods
//Method overriding : custom implementation of printDetails in child1,child2,child3
//Access control : Use of protected access to allow subclass access while maintaining encapsulation
//Polymorphism : The main method uses polymorphism to call the overridden printDetails method, demonstrating dynamic method dispatch.(Runtime polymorphism)
