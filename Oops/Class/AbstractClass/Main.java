package InterviewPrep.Oops.Class.AbstractClass;

public class Main {
    public static void main(String[] args)
    {
        Audi objAudi = new Audi(25);

        objAudi.pressDualBrakeSystem();
        objAudi.pressClutch();
        objAudi.pressBrake();
        System.out.println(objAudi.getNumberOfWheels());

    }
}
