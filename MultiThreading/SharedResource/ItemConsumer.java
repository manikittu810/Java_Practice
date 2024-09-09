package InterviewPrep.MultiThreading.SharedResource;

public class ItemConsumer implements Runnable{
    SharedResource sharedResource;
    ItemConsumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Consumer Thread entered runnable state  and calls sharedResource.consumeItem()......  : " +Thread.currentThread().getName() );
            sharedResource.consumeItem();
        System.out.println("Consumer Thread exited runnable state......  : " +Thread.currentThread().getName() );

    }
}
