package InterviewPrep.MultiThreading.ThreadPoolExecutor.FutureImpl;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory2 implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r){
        return new Thread(r);
    }
}
