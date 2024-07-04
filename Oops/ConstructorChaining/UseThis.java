package InterviewPrep.Oops.ConstructorChaining;

public class UseThis {
    int empId;
    String name;
    UseThis(){
        this(10);
    }
    UseThis(int empId){
        this("smk",empId);
    }
    UseThis(String s,int empId){
        this.name = s;
        this.empId = empId;
    }
}
class Main{
    public static void main(String[] args){
        UseThis obj = new UseThis();
        System.out.println(obj.name +" "+ obj.empId);

    }
}