package InterviewPrep.Oops.Class.AbstractClass;

public class Doctor extends Person{
    protected  int total(int a, int b){
        int totalSum =a+b;
        return totalSum;
    }

    @Override
    protected int print() {
        return 0;
    }
}
