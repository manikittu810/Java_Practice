package InterviewPrep.MultiThreading.DeprecatedMethods;

public class DeadLockTest1 {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockTest1 test = new DeadLockTest1();
        test.createTests();
    }

    public void createTests() {
        Thread t1 = new Thread(() -> {
            try {
                simulateDeadLock(true);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                Thread.currentThread().interrupt();
            }


        });
        Thread t2 = new Thread(() -> {
            try {
                simulateDeadLock(false);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                Thread.currentThread().interrupt();
            }

        });
        System.out.println("Threads started execution ..... ");
        t1.start();
        t2.start();
    }

    public void simulateDeadLock(boolean acquireLock) throws InterruptedException {
        if (acquireLock) {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " lock acquired");
                Thread.sleep(5000);
                System.out.println("This is a DeadLock created by : " + Thread.currentThread().getName() + " on object lock1.... ");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "Lock released");
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " lock acquired");
                Thread.sleep(5000);
                System.out.println("This is a DeadLock created by : " + Thread.currentThread().getName() + " on object lock2...");

                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "Lock released");
                }
            }
        }
    }
}