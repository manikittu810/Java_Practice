package InterviewPrep.pairInJavaImpl;

//Step 1: Basic Pair Implementation
//Goal: Implement a basic Pair class to hold two values and try creating and printing some pairs.
//        Tasks:
//Implement a simple Pair<U, V> class with first and second fields.
//Add a constructor to initialize the fields and a toString() method for easy printing.
//Create some pairs and print them to test your implementation.
//*******************************************************************************************************************
//Step 2: Add Comparable Interface
//Goal: Make the Pair class sortable based on one of its fields (e.g., first).
//Tasks:
//Modify Pair to implement Comparable<Pair<U, V>>.
//Define a natural ordering based on first (or another field of your choice).
//Test by adding pairs to a List or PriorityQueue and sorting them.
//*******************************************************************************************************************



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair <U extends Comparable<U>,V extends Comparable<V>> implements Comparable<Pair<U,V>>{ // this is for Comparable interface implementation

    private final U first;
    private final V second;

    Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
    public U getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    @Override
    public int compareTo(Pair<U,V> other){//this is for implementing the method from Comparable
     return  this.first.compareTo(other.first);
    }
    @Override
    public String toString(){
        return "first value is : " + this.first + " second value is : " +this.second;
    }
}

class Main{
    public static void main(String[] args) {
        List<Pair<Integer, Integer>> obj = new ArrayList<>();
        obj.add(new Pair<>(1, 2));
        obj.add(new Pair<>(0, 1));
        obj.add(new Pair<>(3, 0));

        // Sort naturally by `first` using `Comparable` implementation
        Collections.sort(obj);
        System.out.println("Sorted by first (natural order):");
        for (Pair<Integer, Integer> P : obj) {
            System.out.println(P);
        }

        // Sort by `second` using `PairComparatorBySecond`
        Collections.sort(obj, new PairComparatorBySecond<>());
        System.out.println("Sorted by second:");
        for (Pair<Integer, Integer> P : obj) {
            System.out.println(P);
        }
    }
}
