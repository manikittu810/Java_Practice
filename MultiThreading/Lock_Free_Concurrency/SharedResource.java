package InterviewPrep.MultiThreading.Lock_Free_Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

//first try without Lock free and synchronized

public class SharedResource {
//    int counter =0;
    AtomicInteger counter = new AtomicInteger(0);
//     public synchronized void setCounter(){ //you CAN ALSO USE SYN
    public void setCounter(){
        counter.incrementAndGet();
//counter++;
    }
    public int getCounter(){
//             public synchronized int getCounter(){
        return  counter.get();
//        return counter;
    }

}
class Test{
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        for(int j=0;j<20;j++) {
            Thread t1 = new Thread(() -> {
                try {
                    for (int i = 0; i < 400; i++) {
                        obj.setCounter();
                    }
                } catch (Exception ignored) {
                }
            });

            Thread t2 = new Thread(() -> {
                try {
                    for (int i = 0; i < 400; i++) {
                        obj.setCounter();
                    }
                } catch (Exception ignored) {
                }
            });
            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException ignored) {
            }

            System.out.println(obj.getCounter());
        }
// we need to get 16000 as final output, but we don't get that, because of there is no Periodical-Sync between two L1 and L2 caches in a multicore cpu.
        //Now we have two ways to implement synchronized concurrency ->1) using synchronized keyword, 2)using Lock-free Atomic model.
//        synchronized is a locked mechanism ,
//        whereas AtomicInteger Implementation is Lock free method. The above is an Example of Lock free Method.

    }
}
