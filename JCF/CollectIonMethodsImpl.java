package InterviewPrep.JCF;

import java.util.*;

public class CollectIonMethodsImpl {
    @SuppressWarnings("All")
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);


        System.out.println("Size   :" + l.size());
        System.out.println("contains : " + l.contains(5));
        System.out.println("IsEmpty :" + l.isEmpty());
        l.add(5);
        System.out.println("contains :" + l.contains(5));
        l.remove(3);
        System.out.println("Removed using Index  :" + l.contains(5));
        //remove using the object , remove the first occurrence of value
        l.remove(Integer.valueOf(3));
        System.out.println("removed using object :" + l.contains(3));

        Stack<Integer> st = new Stack<>();
        st.add(6);
        st.add(7);
        st.add(8);

        l.addAll(st); // adding all the values of stack into a list, l.

        System.out.println("adAll() test using containsAll : " + l.containsAll(st));

        l.remove(Integer.valueOf(7));//7 removed from list
        System.out.println("adAll() test using containsAll : " + l.containsAll(st));

        l.removeAll(st);
        System.out.println("removeAll : " + l.contains(8));
        l.clear();
        System.out.println("Cleared the list : " + l);

        //Priority Queue Implementation minHeap

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(10);
        pq.add(-1);
        pq.add(-100);
        pq.add(200);
        System.out.println("Using Iterator to print values");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
        }
        System.out.println("Printing values using forEach method");
        pq.forEach((Integer x) -> System.out.println(x));

        System.out.println("polling values from Priority Queue");
        while (!pq.isEmpty()) {
            int val1 = pq.poll();
            System.out.print(val1 + " ");
            if (pq.contains(-1)) {
                pq.remove(Integer.valueOf(-1));
            }
            System.out.println();
        }

        //Priority Queue Implementation maxHeap


        PriorityQueue<Integer> p = new PriorityQueue<>((Integer a, Integer b) -> b - a);

        p.add(100);
        p.add(200);
        p.add(-100);
        p.add(-400);
        p.add(-500);

        while(!p.isEmpty()){
            int val3 = p.poll();
            System.out.println("Max Heap Poll : " + val3);
        }
    }
}