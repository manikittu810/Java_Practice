package InterviewPrep.HashMapImpl;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Zero");
        map.put(null, "TEST");
        map.put(0, null);
        map.put(1, "A");
        map.put(2, "B");

        map.putIfAbsent(null, "test");
        map.putIfAbsent(4, "s");
        map.putIfAbsent(5, "M");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer n = entry.getKey();
            String s = entry.getValue();
            System.out.println(n + "...." + s);
        }
        System.out.println("isEmpty() " + map.isEmpty());
        System.out.println("Size() " + map.size());
        System.out.println("containsKey(3) " + map.containsKey(3));
        System.out.println("get(5) " + map.get(5));
        System.out.println(map.getOrDefault(9, "default value"));
        System.out.println("remove(null) " + map.remove(null));

        for (Integer key : map.keySet()) {
            System.out.println("Key : " + key);
        }
        System.out.println();
        Collection<String> values = map.values();
        System.out.print("{");
        for (String s : values) {
            System.out.print(s + " ");
            System.out.print(",");
        }
        System.out.print("}");

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer k = entry.getKey();
            String s = entry.getValue();
            System.out.println("Key :" + k + " value : " + s);
        }
        System.out.println();

        map.forEach((Integer n, String s) -> System.out.println(n + "......" + s));

        System.out.println();

        Map<Integer, String> map2 = new LinkedHashMap<>(); //maintains insertion order
        //Map<Integer,String> map2 = new Collections.synchronizedMap(new LinkedHashMap<>()); // Thread safe version
        map2.put(null, "TEST");
        map2.put(0, null);
        map2.put(1, "A");
        map2.put(3, "Zero");
        map2.put(2, "B");
        map2.put(null, "test");
        map2.put(4, "s");
        map2.put(5, "M");
        map2.forEach((Integer n, String s) -> System.out.println(n + "...." + s));
        System.out.println();


        Map<Integer, String> map1 = new LinkedHashMap<>(16, 0.75F, true); // maintains access order
        //Map<Integer,String> map2 = new Collections.synchronizedMap(new LinkedHashMap<>(16, 0.75F, true)); // Thread safe version

        map1.put(null, "TEST");
        map1.put(0, null);
        map1.put(1, "A");
        map1.put(3, "Zero");
        map1.put(null, "test");
        map1.put(4, "s");
        map1.put(5, "M");
        map1.get(3);
        map1.get(5);
        map1.get(1);
        map1.get(null);
        map1.forEach((Integer n, String s) -> System.out.println(n + "...." + s));
        System.out.println();

        Map<Integer,String> tm = new TreeMap<>((Integer a, Integer b) -> b-a); //descending order
//        tm.put(null, "TEST"); cannot insert null
        tm.put(0, null);
        tm.put(1, "A");
        tm.put(3, "Zero");
//        tm.put(null, "test");
        tm.put(4, "s");
        tm.put(5, "M");
        tm.forEach((Integer a, String b) -> System.out.println(a + "....." + b));
        System.out.println();

        Map<Integer,String> tm1 = new TreeMap<>(); // if default declaration then , ascending order
//        tm.put(null, "TEST"); cannot insert null
        tm1.put(0, null);
        tm1.put(1, "A");
        tm1.put(3, "Zero");
//        tm.put(null, "test");
        tm1.put(4, "s");
        tm1.put(5, "M");
        tm1.forEach((Integer a, String b) -> System.out.println(a + "....." + b));
        System.out.println();
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(6);
        s1.add(9);
        System.out.println(s1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(-1);
        s2.add(-3);
        s2.add(-6);
        s2.add(-9);
        s2.add(1);
        System.out.println(s2);

        s1.addAll(s2);
        System.out.println(s1);

        s1.retainAll(s2); //prints elements not present in set1->Intersection
        System.out.println(s1);

        s1.removeAll(s2);
        System.out.println(s2);
        System.out.println();
        System.out.println("Thread Safe TreeMap Impl: ");

        //Thread safe version of HashSet
        ConcurrentSkipListSet threadSafeSet= new ConcurrentSkipListSet<>();
        threadSafeSet.add(1);
        threadSafeSet.add(2);
        Iterator<Integer> it = threadSafeSet.iterator();
        while(it.hasNext()){
            int val = it.next();
            if(val==2){
                threadSafeSet.add(3);
            }
        }
        threadSafeSet.forEach(n -> System.out.println(n+" "));

        System.out.println("LinkedHashSet Impl: ");

        Set<Integer> s3 = new LinkedHashSet<>();
        s3.add(1);
        s3.add(3);
        s3.add(6);
        s3.add(9);
        System.out.println(s3);

        System.out.println("thread safe version of LinkedHashSet");

        Set<Integer> s4 = Collections.synchronizedSet(new LinkedHashSet<>());
        s4.add(-1);
        s4.add(3);
        s4.add(6);
        s4.add(-9);
        System.out.println(s4);

        System.out.println("TreeSet Impl: ");

        Set<Integer> s5 = new TreeSet<>();
        s5.add(100);
        s5.add(773);
        s5.add(6333);
        s5.add(9222);
        System.out.println(s5);

        System.out.println("ThreadSafe TreeSet Impl: ");

        SortedSet<Integer> s6 = Collections.synchronizedSortedSet(new TreeSet<>());
        s6.add(100);
        s6.add(773);
        s6.add(6333);
        s6.add(-9222);
        System.out.println(s6);

    }
}