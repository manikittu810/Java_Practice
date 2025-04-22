package InterviewPrep.MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //'ThreadPoolExecutor' used with 'try'-with-resources statement

        try (
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 2,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(), new CustomRejectHandler())) {

            threadPoolExecutor.allowCoreThreadTimeOut(true);

            //submitting a task into a threadPool executor

            for (int i = 0; i <= 7; i++) {
                threadPoolExecutor.submit(() -> {
                    try {
                        Thread.sleep(3000);//
                        System.out.println(Thread.currentThread().getName() + " Thread is doing simulating some work");
                    } catch (InterruptedException ignored) {
                    }
                });
            }
            //I need to end the worker threads after the task completion

            threadPoolExecutor.shutdown();
        }
//'ThreadPoolExecutor' used with 'try'-with-resources statement


        // we can also use threadPoolExecutor.shutdownNow() for a forced termination of worker threads even though they are simulating or working on some task.

    }
}
