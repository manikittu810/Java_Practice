package InterviewPrep.Oops.PrivateConstructor;

public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern(){
        System.out.println("in th private constructor, creating new instance");

    }

    public static  SingletonPattern getInstance(){
        if(instance == null) {
            instance = new SingletonPattern();
        }
        else{
            System.out.println("returning the existing instance");
        }
        return instance;
    }

}
