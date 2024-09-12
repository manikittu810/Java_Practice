package InterviewPrep.MultiThreading.Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    public void produceItem(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            isAvailable = true;
            System.out.println(Thread.currentThread().getName() + " producer monitor lock acquired");
            Thread.sleep(1000);

        }catch(InterruptedException ignored){}
        finally{
            lock.readLock().unlock();
            System.out.println(Thread.currentThread().getName() + " producer monitor lock released");
        }
    }

    public void consumeItem(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName() + " consumer monitor lock acquired");
            Thread.sleep(1000);
            isAvailable = true;

        }catch(InterruptedException ignored){}
        finally{
            lock.writeLock().unlock();
            System.out.println(Thread.currentThread().getName() + " consumer monitor lock released");

        }
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : Thread started execution.....");

        SharedResource obj = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(()->{
            obj.produceItem(lock);
        });

        Thread t2 = new Thread(() ->{
            obj.produceItem(lock);
        });
        Thread t3 = new Thread(() ->{
            obj.consumeItem(lock);
        });
        System.out.println("Threads  started running.....");

        t1.start();
        t2.start();
        t3.start();
        try{
            System.out.println(Thread.currentThread().getName() + " : Thread sleeping.....");
            Thread.sleep(2000);
            t1.join();
            t2.join();
        }catch (InterruptedException ignored){}
        System.out.println(Thread.currentThread().getName() + " : Thread exited.....");

    }
}