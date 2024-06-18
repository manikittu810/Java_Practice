package InterviewPrep.Oops.Class.AccessSpecifiers.SalesDepartment;

public class Invoice {
     protected void getInvoice(){
        System.out.println("Inside Invoice method");
    }
    public void printInvoice(){
        getInvoice();
    }
    private int getInvoice(int a){
         return a;
    }




}
