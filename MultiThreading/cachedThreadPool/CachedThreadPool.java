package InterviewPrep.MultiThreading.cachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        System.out.println("---------------------Cached Thread Pool-----------------------------------");

        try {
            ExecutorService executor = Executors.newCachedThreadPool();

            for (int i = 1; i <= 10; i++) {
                final int task = i;
                try {
                    Thread.sleep(50L);
                    executor.submit(() ->
                        System.out.println(Thread.currentThread().getName() + " is running task " + task));
                } catch (Exception ignored) {
                }
            }
            executor.shutdown();
        }catch (Exception ignored){}

        System.out.println("---------------------Fixed Thread Pool-----------------------------------");
        try{
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for(int i=0;i<=10;i++) {
                try {
                    Thread.sleep(50L);
                    executorService.submit(() ->
                        System.out.println("Current Thread name is : " + Thread.currentThread().getName()));
                } catch (Exception ignored) {
                }
            }
    executorService.shutdown();
        }catch(Exception ignored){}

        System.out.println("---------------------Single Thread Executor-----------------------------------");
        try{
            ExecutorService executorService1 = Executors.newSingleThreadExecutor();
            for(int i=0;i<=10;i++) {
                try {
                    Thread.sleep(50L);
                    executorService1.submit(() -> System.out.println("Current Thread name is : " + Thread.currentThread().getName()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            executorService1.shutdown();
        }catch(Exception ignored){}

    }
}
