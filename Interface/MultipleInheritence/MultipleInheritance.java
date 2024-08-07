package InterviewPrep.Interface.MultipleInheritence;

 interface Car {
     void speed();
}
 interface Bike{
    void speed();
}
class Speed implements Car,Bike{
    @Override
    public void speed(){
        System.out.println("Speed gets overrided everytime in this class implementation");
        System.out.println("This is Diamond Problem Multiple Inheritance Implementation");
    }
}
class Test{
    public static void main(String[] args) {
        Speed obj = new Speed();
        obj.speed();
        Car obj1 = new Speed();
        Bike obj2 = new Speed();
        obj1.speed();
        obj2.speed();

    }
}
