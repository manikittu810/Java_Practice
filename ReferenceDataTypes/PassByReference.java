package InterviewPrep.ReferenceDataTypes;

public class PassByReference {
    int empId;

    public void setEmpId(int n){
        this.empId=n;
    }

    public int getEmpId(){
        System.out.println("empId " + empId);
        return empId;
    }

    public static void main(String[] args){
        PassByReference obj = new PassByReference();
        obj.setEmpId(10);
       obj.getEmpId();
        modify(obj);
        obj.getEmpId();

    }
    public static void modify(PassByReference obj){
        obj.empId=20;
    }
}
