package InterviewPrep.Oops.Class.Singleton;

public class LazyInitialization {
    private static LazyInitialization obj;
    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if(obj == null){
            obj = new LazyInitialization();
        }
        System.out.println("New object created at after checking object reference is pointing to null");
        return obj;
    }
}
class Test1{
    public static void main(String[] args) {
        LazyInitialization le = LazyInitialization.getInstance();
    }
}