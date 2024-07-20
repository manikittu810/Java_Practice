package InterviewPrep.Oops.Class.GenericClasses;

public class Pair <K,V>{
    private K key;
    private V value;

  public  Pair(K key,V value){
       this.key = key;
       this.value = value;
   }
   public void setPair(K key,V value){
       this.key= key;
       this.value = value;
   }

    public K getKey() {
        return key;
    }
    public V getValue(){
       return value;
    }
}
class GenericPair {
    public <K,V> void genericMethod(Pair<K,V> pair1, Pair<K,V> pair2){
        if(pair1.getKey().equals(pair2.getKey())){
            System.out.println("true : " + pair2.getValue() + pair2.getKey() + pair1.getKey() + pair1.getValue());
        }
        else{
            System.out.println("false : " + pair2.getValue() + pair2.getKey() + pair1.getKey() + pair1.getValue());
        }
    }

}
class Print{
    public <T extends Number> void printMethod(T num){
    if((int)num%2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    }
}
class Print1 <T>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
class Print2 <T extends Number>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
class ObjectTest2{
    public static void main(String[] args) {
        Pair<String,Integer> obj = new Pair<>("diddy",124);
        Pair<String,Integer> obj1 = new Pair<>("smk",123);
        Pair<String,Integer> obj2 = new Pair<>("sms",125);

        System.out.println(obj.getKey() +":" + obj.getValue());
        System.out.println(obj1.getKey() +":" + obj1.getValue());
        System.out.println(obj2.getKey() +":" + obj2.getValue());

        GenericPair obj3 = new GenericPair();
        obj3.genericMethod(obj,obj1);

        Print objNum = new Print();
        objNum.printMethod(2);

        Print1 objT = new Print1<>();
        objT.setValue(1);
        System.out.println(objT.getPrintValue());
        objT.setValue("hello");
        System.out.println(objT.getPrintValue());

        Print2<Integer> objZ = new Print2<>();
        objZ.setValue(2);
        System.out.println(objZ.getPrintValue());
    }
}