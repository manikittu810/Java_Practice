package InterviewPrep.Oops.Class.AbstractClass.AbstractClass1;

public abstract class BMW extends Car {
    BMW(int mileage) {
        super(mileage);
    }

    @Override
    public void pressBrake() {
        System.out.println("Vehicle decelerated - BMW");

    }
    public abstract void  pressDualBrakeSystem();
}
