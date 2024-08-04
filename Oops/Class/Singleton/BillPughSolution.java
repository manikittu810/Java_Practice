package InterviewPrep.Oops.Class.Singleton;


public class BillPughSolution {
    private BillPughSolution(){}

    private static class NestedClassDBConnectionHelper{
    private static final BillPughSolution INSTANCE_OBJECT = new BillPughSolution();
    }
    public static BillPughSolution getInstance(){
        System.out.println("Bill pugh Implemented -> connection - object created ");
        return NestedClassDBConnectionHelper.INSTANCE_OBJECT;
    }

}
class Test4{
    public static void main(String[] args) {
        BillPughSolution obj = BillPughSolution.getInstance();
        System.out.println(obj);
    }
}
