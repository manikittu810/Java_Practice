package InterviewPrep.MultiThreading.DeprecatedMethods;

public class Test {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        System.out.println("Main thread Created : " + Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            System.out.println("Calling for monitorLock() method....  : " + Thread.currentThread().getName());
            obj.monitorLock();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Calling for monitorLock() method....  : " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (Exception ignored) {
            }
            obj.monitorLock();

        });

        System.out.println("Threads starting.....");

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Thread 1 is suspended....  " + Thread.currentThread().getName());
//        t1.suspend();

        System.out.println("Main thread Ended here ..... : " + Thread.currentThread().getName());

    }
}
