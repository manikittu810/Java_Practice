package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.concurrent.*;

public class PracticeExample1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor  = new ThreadPoolExecutor(
                1,1,5, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        Future<?> obj = threadPoolExecutor.submit(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Task Submitted ");
            }catch(Exception e){

            }
        });
        System.out.println(obj.isDone());
        try{
            obj.get(2,TimeUnit.SECONDS);
        }catch(TimeoutException e){
            System.out.println("TimeOut Exception happened");
        }
        catch(Exception e){}

        try{
            obj.get();
        }catch(Exception e){}

        System.out.println(obj.isDone());
        System.out.println(obj.isCancelled());

    }
}
