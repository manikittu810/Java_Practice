package InterviewPrep.MultiThreading.scheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorImpl {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 3;i++) {
            pool.schedule(() -> {
                System.out.println(Thread.currentThread().getName() + " Thread executing a task....");
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }, 4, TimeUnit.SECONDS);
            pool.schedule(pool::shutdown, 14, TimeUnit.SECONDS);
        }

//FixedRateTaskExample
        System.out.println("---------------------------FixedRateTaskExample-------------------------------");
        ScheduledExecutorService pool2 = Executors.newScheduledThreadPool(2);

        pool2.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getName() + " is executing the task...FixedRateTaskExample");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        },2,3,TimeUnit.SECONDS);
        pool2.schedule(pool2::shutdown,20, TimeUnit.SECONDS);

//FixedDelayTaskExample
        System.out.println("---------------------------FixedDelayTaskExample-------------------------------");
        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(3);
        pool3.scheduleWithFixedDelay(()->{
            System.out.println(Thread.currentThread().getName()+" is executing the task....FixedDelayTaskExample");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        },2,5,TimeUnit.SECONDS);

        pool3.schedule(pool3::shutdown,20,TimeUnit.SECONDS);


    }
}
