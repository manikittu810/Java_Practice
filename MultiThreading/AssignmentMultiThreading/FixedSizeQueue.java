package InterviewPrep.MultiThreading.AssignmentMultiThreading;

import java.util.ArrayDeque;
import java.util.Deque;

public class FixedSizeQueue<Integer> {
    private final int capacity;
    private final Deque<Integer> queue;

    public FixedSizeQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive...");
        }
        this.capacity = capacity;
        this.queue = new ArrayDeque<>(capacity);
    }

    public boolean isFull(){
        return queue.size() == capacity;
    }
    public void offer(Integer element) {
        if (isFull()) {
            System.out.println("Queue size cannot be empty....");
            return;
        }
        if(!isFull()){
            queue.offer(element);
        }
    }

    public int removeElement() {
        if (!queue.isEmpty()) {
             return  (int)queue.remove();
        }
        return -1;
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int top(){
        return (int) queue.peekLast();
    }
}
