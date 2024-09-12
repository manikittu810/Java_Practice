package InterviewPrep.MultiThreading.Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produceItem(StampedLock lock){
        long stamp = lock.readLock();
        try{
            System.out.println(Thread.currentThread().getName()+" : Thread got stamped lock");
            isAvailable = true;
            Thread.sleep(3000);
        }catch(InterruptedException ignored){}
        finally{
            lock.unlock(stamp);
            System.out.println(Thread.currentThread().getName()+" : Thread got stamped unlock");
        }

    }

    public void consumeItem(StampedLock lock){
        long stamp = lock.writeLock();
        try{
            System.out.println(Thread.currentThread().getName()+" : Thread got stamped lock");
            isAvailable = false;
            Thread.sleep(1000);
        }catch(InterruptedException ignored){}
        finally{
            lock.unlock(stamp);
            System.out.println(Thread.currentThread().getName()+" : Thread got stamped unlock");
        }

    }

}
class Test{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is starting.....");
    SharedResource obj = new SharedResource();
        StampedLock lock = new StampedLock();
        Thread t1 = new Thread(() -> {
            obj.produceItem(lock);
        });

        Thread t2 = new Thread(()->{
            obj.produceItem(lock);
        });

        Thread t3 = new Thread(()->{
            obj.consumeItem(lock);
        });
        System.out.println("Threads starting here : ");

        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName() +" thread exited.....");
    }
}