package InterviewPrep.Oops.Class.Singleton;


public enum ENUMClass {
    INSTANCE;//by default private static final
}
class Test5{
    public static void main(String[] args) {
        ENUMClass obj = ENUMClass.valueOf("INSTANCE");
        System.out.println(obj.ordinal());
    }
}
