package InterviewPrep.MultiThreading.ThreadPoolExecutor.CompletableFuture;

import java.util.concurrent.*;

public class Practice1 {
    public static void main(String[] args) {
       try{ ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,3, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
           threadPoolExecutor.allowCoreThreadTimeOut(true);

        CompletableFuture<String>  obj = CompletableFuture.supplyAsync(()->{
            return "Task Completed on thread : " + Thread.currentThread().getName();

        },threadPoolExecutor).thenApply((String val)->{
            return val+"\nstarting next task on thread : " + Thread.currentThread().getName();
        }).thenApplyAsync((String val)->{
               return val+"\nstarting next task on thread : " + Thread.currentThread().getName();
           },threadPoolExecutor).thenCompose((String val)->{

               return CompletableFuture.supplyAsync(()->{
                        return val + "\nThis is on thread : " + Thread.currentThread().getName();
                    },threadPoolExecutor);
                }).thenComposeAsync((String val)->{

               return CompletableFuture.supplyAsync(()->{
                   return val + "\nThis is on thread : " + Thread.currentThread().getName();
               },threadPoolExecutor);
           });

        CompletableFuture<Void> obj2 = CompletableFuture.
                supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() +" Tasks finished......");
            return "Concept and ";
        },threadPoolExecutor).
                thenAcceptAsync((String val) ->{
            System.out.println(val +" All stages finished .... : " + Thread.currentThread().getName());
        });
           try{
               System.out.println("Thread Sleeping : " + Thread.currentThread().getName());
               Thread.sleep(5000);
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
           System.out.println(obj.get());


    }catch(Exception ignored){}
    }
}
