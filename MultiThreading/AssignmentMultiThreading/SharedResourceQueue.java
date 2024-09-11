package InterviewPrep.MultiThreading.AssignmentMultiThreading;

//Producer Consumer Problem
public class SharedResourceQueue {
    FixedSizeQueue<Integer> q = new FixedSizeQueue<>(6);

    public synchronized void addItem(){
        int i=0;
        while(q.isEmpty()  || !q.isFull()){
            q.offer(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Producer thread adding elements into the queue : " + q.top());
        }
        notifyAll();
        System.out.println("Producer thread "+Thread.currentThread().getName() + " (removed the Monitor lock) notified all threads to start execution");
    }

    public synchronized void removeItem() throws InterruptedException {
        try{
            if(q.isEmpty()){
                wait();
            }
        }
        catch(InterruptedException ignored){}
        while(!q.isEmpty()){
            int n = q.removeElement();
            Thread.sleep(1000);
            System.out.println("Deleting element " + n +" from queue");
        }
    }

}

class TestBuffer{
    public static void main(String[] args) {
        System.out.println("Entered Main method......");
        SharedResourceQueue obj = new SharedResourceQueue();
        System.out.println("Creating Threads......");
        Thread itemProducer = new Thread(new ProducerItem(obj));
        Thread itemConsumer = new Thread(new ConsumerItem(obj));
        System.out.println("Threads started execution......");
        itemConsumer.start();
        itemProducer.start();
        System.out.println("Exiting the Main method...........");

    }
}
