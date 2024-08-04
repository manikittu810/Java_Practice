package InterviewPrep.Oops.Class.Singleton;

//Eager Initialization
public class DBConnection {
    private static DBConnection obj = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        System.out.println("new object instantiated -> Eager Initialization");
        return obj;
    }
}
class Test{
    public static void main(String[] args) {
        DBConnection db = DBConnection.getInstance();
    }
}