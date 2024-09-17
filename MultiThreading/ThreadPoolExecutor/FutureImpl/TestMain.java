package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestMain {
    public static void main(String[] args){
        Future<List<Integer>> obj;
        try (ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 4, 1, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory1(), new CustomRejectHandler1())) {

            threadPoolExecutor.allowCoreThreadTimeOut(true);

            List<Integer> output = new ArrayList<>();
            Future<List<Integer>> futureObj = threadPoolExecutor.submit(new MyCustomRunnable(output), output);

            try {
                futureObj.get();
//                1st way
                System.out.println(output.get(0));

//                2nd way
                List<Integer> res = futureObj.get();
                System.out.println(res.get(0));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            List<Integer> res = new ArrayList<>();
            obj = threadPoolExecutor.submit(() -> {
                res.add(10);
                return res;
            });
        }


        try{
            List<Integer> res1= obj.get();
            System.out.println(res1.get(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
