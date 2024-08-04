package InterviewPrep.Oops.Class.Singleton;

public class Synchronized {
    private static Synchronized sync;
    private Synchronized(){}

    synchronized public static Synchronized getInstance(){
        if(sync == null){
            sync = new Synchronized();
        }
        System.out.println("This is a synchronized singleton class");
        return sync;
    }
}
class Test2{
    public static void main(String[] args) {
        Synchronized s = Synchronized.getInstance();
    }
}
//The synchronized keyword is used to lock the method,
// allowing only one thread to execute it at a time
//------------------------------------------------------
//  The keyword synchronized in the method declaration is used to
//  prevent concurrent access to the method by multiple threads, ensuring thread safety.

//-----------------------------------------------------

//In the synchronized keyword in the method,everytime it does lock and unlock for every thread
//which wants to enter the process and this costs a lot of time.
