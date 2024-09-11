package InterviewPrep.MultiThreading.DeprecatedMethods;

public class DeadlockTest {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadlockTest test = new DeadlockTest();
        test.startTest();
    }

    public void startTest() {
        Thread t1 = new Thread(() -> {
            try {
                method1();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                Thread.currentThread().interrupt();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                method2();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                Thread.currentThread().interrupt();
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000); // Ensure both threads are running
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Interrupt thread t1 to simulate deadlock resolution
        System.out.println("Interrupting Thread-1");
        t1.interrupt(); // Safely interrupts t1
    }

    public void method1() throws InterruptedException {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            Thread.sleep(100); // Simulate some work

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");

            }
        }
    }

    public void method2() throws InterruptedException {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " acquired lock2");
            Thread.sleep(100); // Simulate some work
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");
            }
        }
    }
}
