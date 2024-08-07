package InterviewPrep.Interface;


interface Car {
     void applyBreak();
}
class CarImpl implements Car{

    @Override
    public void applyBreak() {
        System.out.println("Break applied");
    }
}
class Test{
    public static void main(String[] args) {
        CarImpl obj = new CarImpl();
        Car obj1 = new CarImpl();
        obj.applyBreak();
        obj1.applyBreak();
    }
}
