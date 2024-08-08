package InterviewPrep.Interface.DefaultInInterface;

public interface Bird {
    default boolean canBreathe(){
        return true;
    }
}
interface Something extends Bird{
     default boolean canBreathe(){
        System.out.println("from child interface extending both classes");
        return true;
    }
}
class SomethingDiff implements Something,Bird{
    public boolean canBreathe(){
        System.out.println("In class now");
        return true;
    }
}
class Test{
    public static void main(String[] args) {
        Bird obj = new SomethingDiff();
        obj.canBreathe();
        Something obj1 = new SomethingDiff();
        obj1.canBreathe();
    }
}
