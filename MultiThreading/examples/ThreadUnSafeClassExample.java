package InterviewPrep.MultiThreading.examples;

import java.util.Random;

public class ThreadUnSafeClassExample {
    // this is to use to randomly to make our threads sleep
    static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws InterruptedException {
        ThreadUnSafeCounter counter = new ThreadUnSafeCounter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    counter.increment();
                    try {
                        ThreadUnSafeClassExample.sleepRandomlyForLessThan10secs();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    counter.decrement();
                    try{
                        ThreadUnSafeClassExample.sleepRandomlyForLessThan10secs();
                    }catch (InterruptedException e){}
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        counter.printFinalCount();
    }
    public static void sleepRandomlyForLessThan10secs () throws InterruptedException {
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
        }
    }

}

class ThreadUnSafeCounter{
    int count =0;
    void increment(){
        count++;
    }
    void decrement(){
        count--;
    }
    void printFinalCount(){
        System.out.println("The final value of the counter is : " + count);
    }
}