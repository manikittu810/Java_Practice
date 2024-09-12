package InterviewPrep.MultiThreading.Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class OptimisticStampedLock {
int a=10;
    public void itemProducer(StampedLock lock){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println(Thread.currentThread().getName() + "  optimistic-read-lock acquired");
                    a = 11;
                    Thread.sleep(2000);
                    if (lock.validate(stamp)){
                        System.out.println("updated value SuccessFully");

                    }
                    else{
                        System.out.println("roll back to previous value");
                        a=10;
                    }
        }catch (Exception ignored) {}
    }
    public void itemConsumer(StampedLock lock){
        long stamp = lock.writeLock();
        System.out.println(Thread.currentThread().getName() + "   optimistic - write - lock acquired");
        try{
            System.out.println(Thread.currentThread().getName() + " performing work.....");
            a=9;
        }
        finally{
            lock.unlock(stamp);
            System.out.println(Thread.currentThread().getName() + "  optimistic - write - lock released");
        }

    }
}
class TestLock{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " threading starting......");
        OptimisticStampedLock obj = new OptimisticStampedLock();
        StampedLock lock = new StampedLock();
        System.out.println("Creating Threads ..............");
        Thread t1 = new Thread(() -> {
            obj.itemProducer(lock);
        });

        Thread t2 = new Thread(() -> {
            obj.itemProducer(lock);
        });

        Thread t3 = new Thread(() -> {
            try{
                Thread.sleep(3000);

                obj.itemConsumer(lock);
            }catch (Exception ignored){}
        });
        System.out.println("Threads starting here ............... ");
        t1.start();
        t2.start();
        t3.start();
    }


}