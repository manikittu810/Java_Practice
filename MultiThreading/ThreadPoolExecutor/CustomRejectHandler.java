package InterviewPrep.MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r,ThreadPoolExecutor executor){
        System.out.println("Task Denied : " + r.toString()); //logging the message
        //logs which task has been rejected after a bounded queue is full and this current task got rejected
    }

}
