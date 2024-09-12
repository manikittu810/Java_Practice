package InterviewPrep.MultiThreading.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignalImpl {
    private final Queue<Integer> sharedBuffer;
    private final int bufferSize;
    private final ReentrantLock lock;
    private final Condition notFull;
    private final Condition notEmpty;

    AwaitSignalImpl(int bufferSize) {
        this.bufferSize = bufferSize;
        this.sharedBuffer = new LinkedList<>();
        this.lock = new ReentrantLock();
        this.notFull = lock.newCondition();
        this.notEmpty = lock.newCondition();
    }

    public void producerImpl(int i) {
        lock.lock();
        try {
            while (sharedBuffer.size() == bufferSize) {
                notFull.await();
            }
            sharedBuffer.add(i);
            System.out.println("Produced: " + i); // Print produced item for debugging
            notEmpty.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            e.printStackTrace(); // Print stack trace for debugging
        } finally {
            lock.unlock();
        }
    }

    public void consumerImpl() {
        lock.lock();
        try {
            while (sharedBuffer.size() == 0) {
                notEmpty.await();
            }
            int item = sharedBuffer.remove(); // Remove item from the buffer
            System.out.println("Consumed: " + item); // Print consumed item for debugging
            notFull.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            e.printStackTrace(); // Print stack trace for debugging
        } finally {
            lock.unlock();
        }
    }
}

class Main {
    public static void main(String[] args) {
        AwaitSignalImpl obj = new AwaitSignalImpl(3);

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                obj.producerImpl(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                obj.consumerImpl();
            }
        });

        producer.start();
        consumer.start();
    }
}
