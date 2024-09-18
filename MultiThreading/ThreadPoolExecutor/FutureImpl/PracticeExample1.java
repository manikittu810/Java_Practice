package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.concurrent.*;

public class PracticeExample1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor  = new ThreadPoolExecutor(
                1,1,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?> obj = threadPoolExecutor.submit(()->{
            System.out.println("Task Submitted ");
        });
        threadPoolExecutor.shutdown();
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println(obj.isDone());
        System.out.println(obj.isCancelled());

    }
}
