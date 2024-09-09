package InterviewPrep.MultiThreading.SharedResource;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized  void addItem(){
        isItemAvailable = true;
        System.out.println("Monitor Lock implemented for thread entered addItem Method() : "+Thread.currentThread().getName());
        notifyAll();
        System.out.println("Thread in the addItem() sent wakeUp call using notifyAll() for all waiting threads to wakeUp.......... : " + Thread.currentThread().getName());
    }
    public synchronized void consumeItem(){
        System.out.println("Thread Entered consumeItem() method : " +Thread.currentThread().getName());
        //we are going to use while loop to avoid "spurious wakeup", sometime system makes noise.....
        while(!isItemAvailable){
            try{
                System.out.println("Thread in consumeItem() method is going to wait() until it receives a notifiedAll() wakeUp call.... : "+ Thread.currentThread().getName());
                wait();
                System.out.println("wakeUp call Received for wait() in consumeItem() ..... thread goes into Runnable state back again ..... : "+Thread.currentThread().getName());
            }
            catch(InterruptedException ignored){
            }
        }
        isItemAvailable = false;
    }

}
class TestThread{
    public static void main(String[] args) {
        System.out.println("Welcome to Multithreading............. :)");

        System.out.println("Entered main method");
        SharedResource obj = new SharedResource();
        System.out.println("Creating new Threads ........ ");

        Thread produceItem = new Thread(new ItemProducer(obj));
        Thread consumeItem = new Thread(new ItemConsumer(obj));
        System.out.println("New Threads Created........ ");


        produceItem.start();
        consumeItem.start();
        System.out.println("New Threads Entering into their respective Runnable states.........");
        System.out.println("Exited Main method....");
    }
}
