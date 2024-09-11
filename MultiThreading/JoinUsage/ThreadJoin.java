package InterviewPrep.MultiThreading.JoinUsage;

public class ThreadJoin {
    public synchronized void receiveCall() throws InterruptedException {
        try {
            System.out.println(Thread.currentThread().getName() + " lock acquired...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " lock released...");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted during sleep..");
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
            t1.start();
            try {
                System.out.println(Thread.currentThread().getName() + " thread is waiting to Join with Thread t1.");
                Thread.sleep(3000);
                t1.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread is waiting to Join......");
                Thread.currentThread().interrupt();
            }
            System.out.println("Main Thread exiting after t1 joining it..... : " + Thread.currentThread().getName());
        }
    }
