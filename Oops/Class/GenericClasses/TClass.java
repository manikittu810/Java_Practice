package InterviewPrep.Oops.Class.GenericClasses;

public class TClass<T> {
    T n;
    TClass(T n){
        this.n = n;
    }
    public void setN(T n){
        this.n = n;
    }
    public T getN() {
        return n;
    }
}
class ExtendsT<T> extends TClass<T>{
    ExtendsT(T n){
        super(n);
    }
}

class ObjectTest1{
    public static void main(String[] args) {
        ExtendsT<Integer> obj = new ExtendsT<>(2);
        System.out.println(obj.getN());
    }
}