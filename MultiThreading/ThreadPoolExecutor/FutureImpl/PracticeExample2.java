package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class PracticeExample2 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,3, TimeUnit.SECONDS,
                new ArrayBlockingQueue(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.allowCoreThreadTimeOut(true);

        Future<?> futureObj = threadPoolExecutor.submit(()->{
            System.out.println("Task Submitted.....");
        });

        try{
            Object obj = futureObj.get();
            System.out.println(obj == futureObj);
        }catch(Exception e){

        }


//        UseCase2
        List<Integer> list = new ArrayList<>();
        Future<List<Integer>> futureObj1 =  threadPoolExecutor.submit(() ->{
            System.out.println("Adding some value to the list : ");
            list.add(100);
            System.out.println("Task 2 with runnable and return object....");
        },list);

        try{
            List<Integer> list1 = futureObj1.get();
            System.out.println(list1.get(0));
        }catch(Exception e){}

        Future<List<Integer>> futureObj2 =  threadPoolExecutor.submit(() ->{
            System.out.println("Task3 callable......");
            List<Integer> list2 = new ArrayList<>();
            list2.add(200);
            return list2;
        });

        try{
            List<Integer> list3 = futureObj2.get();
            System.out.println(list3.get(0));
        }catch(Exception e){}


        try{
            futureObj1.get();
            futureObj2.get();
            futureObj.get();
        }catch(Exception e){}

        threadPoolExecutor.shutdown();

        System.out.println(threadPoolExecutor.isTerminating());
    }
}
