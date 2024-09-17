package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.concurrent.*;

public class TestFutureMethods {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,4,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.allowCoreThreadTimeOut(true);

        Future<?> obj = threadPoolExecutor.submit(()->{
           try{
               Thread.sleep(7000);
               System.out.println("Doing some work");
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
        });


        try{
            obj.get(2,TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println("TimeOutException took place...");// after two seconds this print statement will get executed.....
        }

        try{
            obj.get();//caller/main thread will wait indefinitely for the task to get completed.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("is Done : " +obj.isDone());

        System.out.println("is Cancelled : " + obj.isCancelled());

    }
}
