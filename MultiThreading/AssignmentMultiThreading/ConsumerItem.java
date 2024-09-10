package InterviewPrep.MultiThreading.AssignmentMultiThreading;

public class ConsumerItem implements Runnable {
    SharedResourceQueue sharedResourceQueue;

    ConsumerItem(SharedResourceQueue sharedResourceQueue) {
        this.sharedResourceQueue = sharedResourceQueue;
    }

    @Override
    public void run() {
        System.out.println("Thread entered CustomerItem Runnable..... : " + Thread.currentThread().getName());
        try {
            sharedResourceQueue.removeItem();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " used busy wait in removing elements");
    }
}
