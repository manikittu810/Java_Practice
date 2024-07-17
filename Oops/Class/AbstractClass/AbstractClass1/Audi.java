package InterviewPrep.Oops.Class.AbstractClass.AbstractClass1;

public  class Audi extends BMW {
    Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBrakeSystem() {
        System.out.println("Vehicle decelerated - Audi Dual Brake");

    }

    @Override
    public void pressClutch() {
        System.out.println("Vehicle Accelerated - Audi");
    }
//    @Override
//    public void pressBrake() {
//        System.out.println("Vehicle Decelerated - Audi");
//    }
}