package InterviewPrep.HashMapImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(null,"TEST");
        map.put(0,null);
        map.put(1,"A");
        map.put(3,"Zero");
        map.put(2,"B");

        map.putIfAbsent(null,"test");
        map.putIfAbsent(4,"s");
        map.putIfAbsent(5,"M");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            Integer n = entry.getKey();
            String s  = entry.getValue();
            System.out.println(n + "...." + s);
        }
        System.out.println("isEmpty() "+ map.isEmpty());
        System.out.println("Size() "+ map.size() );
        System.out.println("containsKey(3) " + map.containsKey(3));
        System.out.println("get(5) " + map.get(5));
        System.out.println(map.getOrDefault(9,"default value"));
        System.out.println("remove(null) " + map.remove(null));

        for(Integer key : map.keySet()){
            System.out.println("Key : " + key);
        }
        System.out.println();
        Collection<String> values = map.values();
        System.out.print("{");
        for(String s : values){
            System.out.print(s+" ");
            System.out.print(",");
        }
        System.out.print("}");

        System.out.println();

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            Integer k = entry.getKey();
            String s = entry.getValue();
            System.out.println("Key :" +k + " value : " + s);
        }

    }
}
