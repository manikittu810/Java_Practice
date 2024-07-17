package InterviewPrep.Oops.Class.AbstractClass.AbstractClass1;

public class Main {
    public static void main(String[] args)
    {
        Object obj = new Audi(24);
        Audi objAudi = (Audi) obj; // To access methods specific to Audi cast the object
//        Audi objAudi = new Audi(25) ;
        objAudi.pressDualBrakeSystem();
        objAudi.pressClutch();
        objAudi.pressBrake();
        System.out.println(objAudi.getNumberOfWheels());

    }
}
