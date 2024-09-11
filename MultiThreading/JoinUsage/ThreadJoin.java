package InterviewPrep.MultiThreading.JoinUsage;

public class ThreadJoin {
    public synchronized void receiveCall() throws InterruptedException {
        try {
            System.out.println(Thread.currentThread().getName() + " lock acquired...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " lock released...");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " Interrupted during sleep..");
            Thread.currentThread().interrupt();
        }
    }
    public synchronized void receiveCall1() throws InterruptedException {
        try {
            System.out.println(Thread.currentThread().getName() + " lock acquired...");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " lock released...");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " Interrupted during sleep..");
            Thread.currentThread().interrupt();
        }
    }
}

    class Main {
        public static void main(String[] args) throws InterruptedException {
            ThreadJoin obj = new ThreadJoin();
            Thread t1 = new Thread(() -> {
                try {
                    obj.receiveCall();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    obj.receiveCall1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t2.setDaemon(true);
            t1.start();
            t2.start();
            try {
                System.out.println(Thread.currentThread().getName() + " thread is waiting to Join with Thread t1.");
                Thread.sleep(3000);
                t1.join();
                System.out.println(Thread.currentThread().getName() + " joined with t1");
                System.out.println(Thread.currentThread().getName() + " thread is waiting to Join with Thread t2.");
                t2.join();
                System.out.println(Thread.currentThread().getName() + " joined with t2");
            } catch (InterruptedException e) {
                System.out.println("Main thread is waiting to Join......");
                Thread.currentThread().interrupt();
            }
            System.out.println("Main Thread exiting after t1 and t2 joining it..... : " + Thread.currentThread().getName());
        }
    }
