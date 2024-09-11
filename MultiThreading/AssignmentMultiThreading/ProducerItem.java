package InterviewPrep.MultiThreading.AssignmentMultiThreading;

public class ProducerItem implements Runnable {
    SharedResourceQueue sharedResourceQueue;

    ProducerItem(SharedResourceQueue sharedResourceQueue) {
        this.sharedResourceQueue = sharedResourceQueue;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread Started Execution............ : " + Thread.currentThread().getName());
        sharedResourceQueue.addItem();
    }

}
