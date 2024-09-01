import java.util.Vector;
public class CollectionsImpl{
public static void main(String[] args){
System.out.println("Implementing vector : ");
Vector<Integer> v = new Vector<>();

for(int i =0 ;i< 10 ;i++){
v.add(i);
System.out.println("The values of v are : "+ v);
//v.removeElementAt(i);
}
v.forEach((Integer x) -> {

System.out.println("The value goig to be removed is "+ x);
try{
v.remove(x);
}
catch(Exception e){
e.getMessage();
}
};)
}
}
