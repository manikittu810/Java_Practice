package InterviewPrep.MultiThreading;

public class MonitorLocking {
    public synchronized void task1(){
        try {
            System.out.println("In the task1 : Thread t1 goes to sleep()");
            Thread.sleep(10000);
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread t1 comes out of sleep() and gets executed.");
    }

    public void task2(){
        System.out.println("Thread t2 executing task2()");
        synchronized (this){
            System.out.println("Thread t2 getting executing after entering critical section with monitor lock only after t1 coming out of sleep()");
        }
        System.out.println("Thread t2 executed and exited the critical section");
    }
    public void task3(){
        System.out.println("No monitor lock and thread t3 getting executed.");
    }

}
class Main{
    public static void main(String[] args) {
        MonitorLocking obj = new MonitorLocking();
        Thread t1 = new Thread(() -> obj.task1());// creating threads/like  creating ew thread objects
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());
        //starting all the threads.

        t1.start();
        t2.start();
        t3.start();
    }
}

