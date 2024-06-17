package InterviewPrep.Class.AccessSpecifiers.SalesDepartment;

public class Invoice {
     protected void getInvoice(){
        System.out.println("Inside Invoice method");
    }
    public void printInvoice(){
        getInvoice();
    }
}
