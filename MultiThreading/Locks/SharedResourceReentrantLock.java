package InterviewPrep.MultiThreading.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReentrantLock{

ReentrantLock lock = new ReentrantLock();

public void monitorLockImpl(){
try{
lock.lock();
System.out.println(Thread.currentThread().getName()+ " : Lock Acquired");
Thread.sleep(5000);
}
catch(InterruptedException e){
System.err.println(Thread.currentThread().getName() + " Thread is getting Interrupted.");
Thread.currentThread().interrupt();
}
finally{
lock.unlock();
System.out.println(Thread.currentThread().getName()+" : Thread released");
}
}

}
class Test{
public static void main(String[] args){

SharedResourceReentrantLock obj = new SharedResourceReentrantLock();

Thread t1 = new Thread(()->{
	obj.monitorLockImpl();

});

Thread t2 = new Thread(()->{
obj.monitorLockImpl();
});


t1.start();
t2.start();

}
}
