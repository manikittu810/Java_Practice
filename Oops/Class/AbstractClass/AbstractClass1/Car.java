package InterviewPrep.Oops.Class.AbstractClass.AbstractClass1;

public abstract class Car {
    int mileage;
    Car(int mileage){
        this.mileage=mileage;
    }
    public abstract void pressBrake();
    public int getNumberOfWheels(){
        return 4;
    }
    public abstract void pressClutch();
}

