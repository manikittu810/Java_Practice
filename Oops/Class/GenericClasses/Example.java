package InterviewPrep.Oops.Class.GenericClasses;

public class Example {
    Object n;
    public Object getN(){
        return n;
    }
    public void setN(Object n){
        this.n = n;
    }
}

class ObjectTest{
    public static void main(String[] args) {
        Example obj= new Example();
        obj.setN(2);
        Object printValue = obj.getN();
        if((int) printValue  == 2){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }


}