package InterviewPrep.MultiThreading.DeprecatedMethods;
public class SharedResource {
    boolean isAvailable = false;
public synchronized  void monitorLock(){
    isAvailable = true;
    System.out.println("Monitor Lock Acquired by thread : "+ Thread.currentThread().getName());
    try{
        Thread.sleep(8000);
    }
    catch(InterruptedException ignored){

    }
    System.out.println("Lock Released on : " + Thread.currentThread().getName());
}
}
