package InterviewPrep.MultiThreading.SharedResource;

public class ItemProducer implements Runnable{
    SharedResource sharedResource;
    ItemProducer(SharedResource sharedResource){
        this.sharedResource= sharedResource;
    }
    @Override
    public void run(){
        System.out.println("Thread Producer Entered Runnable state : " + Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException ignored){

        }
        sharedResource.addItem();
        System.out.println("Producer thread produced an item  : " +Thread.currentThread().getName());


    }
}
