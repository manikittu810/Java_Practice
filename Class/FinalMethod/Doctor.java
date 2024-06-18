package InterviewPrep.Class.FinalMethod;

public class Doctor extends Person{
    protected void profession(){
        System.out.println("in doctor class");
    }
    @Override
    protected int print(){
        return 0;
    }

}
