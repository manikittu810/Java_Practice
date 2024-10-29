package InterviewPrep.pairInJavaImpl;

//Step 3: Custom Comparator Implementations
//        Goal: Add flexibility by creating different ways to sort pairs.
//        Tasks:
//        Create a Comparator that sorts pairs based on second.
//        Test by sorting a list of pairs using this comparator.
//        Try creating another Comparator that sorts in reverse order by first for a max-heap.

import java.util.Comparator;

public class PairComparatorBySecond<U extends Comparable<U>, V extends Comparable<V>> implements Comparator<Pair<U, V>> {
    @Override
    public int compare(Pair<U, V> p1, Pair<U, V> p2) {
        return p1.getSecond().compareTo(p2.getSecond());
    }
}
