package InterviewPrep.MultiThreading.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer{
    private final Queue<Integer> sharedBuffer;
    private final int bufferSize;

    SharedBuffer(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produceItem(int i) throws InterruptedException{
        while(sharedBuffer.size() == bufferSize){
            wait();
        }
        sharedBuffer.add(i);
        System.out.println("Item added into the buffer is : " + i);
        notify();

    }
    public synchronized void consumeItem() throws InterruptedException{
        while(sharedBuffer.isEmpty()){
            wait();
        }
        int n = sharedBuffer.remove();
        System.out.println("Removed Item from Buffer is : "+ n);
        notify();

    }
}
class Test{
    public static void main(String[] args) {
        SharedBuffer obj = new SharedBuffer(3);
        Thread produceItem = new Thread(() -> {
            for(int i=0;i<6;i++){
                try{
                    obj.produceItem(i);
                }
                catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });

        Thread consumeItem = new Thread(() ->{
            for(int i=0;i<6;i++){
                try{
                    obj.consumeItem();
                }
                catch(InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });

        produceItem.start();
        consumeItem.start();
    }
}