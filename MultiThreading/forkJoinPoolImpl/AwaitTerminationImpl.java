package InterviewPrep.MultiThreading.forkJoinPoolImpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationImpl {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=10;i++){
              int task  = i;
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+" thread is doing some task : " +task);
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
        try{
            if(!executorService.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("Time limit reached .... Force shutting down...");
                executorService.shutdownNow();
            }
            else{
                System.out.println("All tasks completed  successfully in a given time");
            }
        }catch(InterruptedException e){
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println("Shut down complete...");    }
}
