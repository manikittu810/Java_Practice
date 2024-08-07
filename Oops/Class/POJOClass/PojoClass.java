package InterviewPrep.Oops.Class.POJOClass;

public class PojoClass {
    private int rollNumber;
    private String sName;
    public PojoClass(){

    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public void setsName(String sName){
        this.sName =sName;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getsName(){
        return sName;
    }
}
class Main{
    public static void main(String[] args) {
        PojoClass obj = new PojoClass();
        obj.setsName("smk");
        System.out.println(obj.getsName());
        obj.setRollNumber(1);
        System.out.println(obj.getRollNumber());
    }
}
