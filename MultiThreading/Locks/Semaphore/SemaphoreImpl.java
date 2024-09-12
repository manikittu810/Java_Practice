package InterviewPrep.MultiThreading.Locks.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreImpl {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);
    public void producer(){
        try{
            lock.acquire();
            System.out.println(Thread.currentThread().getName() + " Thread acquired() lock");
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception ignored){}
        finally{
            lock.release();
            System.out.println(Thread.currentThread().getName() + " Thread lock released");
        }
    }
}
class TestObj{
    public static void main(String[] args) {
        SemaphoreImpl obj = new SemaphoreImpl();
        Thread t1 = new Thread(()->{
            obj.producer();
        });
        Thread t2 = new Thread(()->{
            obj.producer();
        });
        Thread t3 = new Thread(()->{
            obj.producer();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}