package InterviewPrep.Oops.ConstructorChaining.UseSuper;

 public class ChainSuper {
    int empId;
    ChainSuper(int empId) {
        System.out.println(empId);
        System.out.println("called parent class");
        this.empId = empId;
        System.out.println(empId);
    }
}

class Main{
     public static void main(String[] args){
        SubClass obj = new SubClass("smk",1000);
//        obj.empId=100;
         System.out.println(obj.name +" "+ obj.empId);

     }
}