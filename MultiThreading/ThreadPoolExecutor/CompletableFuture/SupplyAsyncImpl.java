package InterviewPrep.MultiThreading.ThreadPoolExecutor.CompletableFuture;

import java.util.concurrent.*;

public class SupplyAsyncImpl {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                    2, 4, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task finished";
            },threadPoolExecutor);
            System.out.println(asyncTask1.get());

        }catch(Exception e){
            System.out.println("Task Interrupted......");
        }

    }
}
