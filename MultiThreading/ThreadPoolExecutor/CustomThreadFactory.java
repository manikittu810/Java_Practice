package InterviewPrep.MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);// instead of writing Thread th = new Thread(r); return th; we are using the Inline block
    }
}
