package InterviewPrep.Oops.Class.Singleton;

public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking db;
    private DoubleCheckLocking(){}
    public static DoubleCheckLocking getInstance(){ // solves the problem of concurrency
        if(db == null){
            synchronized (DoubleCheckLocking.class){
                if(db ==null){
                    db = new DoubleCheckLocking();
                }
                System.out.println("Thread entered the process and instance created");
            }
        }
        System.out.println("Implemented Double-checked Instance");
        return db;
    }
}
class Test3{
    public static void main(String[] args) {
        DoubleCheckLocking object  =  DoubleCheckLocking.getInstance();
    }
}
//Disadvantage is -> Memory Issue ->cache(s)->avaoided by 'volatile'
//Two issues.