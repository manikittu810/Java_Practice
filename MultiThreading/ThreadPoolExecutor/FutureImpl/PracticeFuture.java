package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.concurrent.*;

public class PracticeFuture {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,4,3, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        for(int i=0;i<10;i++){
            threadPoolExecutor.submit(()->{
                try{
                    System.out.println(Thread.currentThread().getName() + " Thread doing some work...");
                    Thread.sleep(5000);
                }catch(Exception e){
                    System.out.println("Task Denied ......." + e.getMessage());
                }
            });
        }
    }
}
