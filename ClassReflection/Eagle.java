package InterviewPrep.ClassReflection;

public class Eagle {
    private String name;
    protected int n;
    public void display(){
        System.out.println("Nothing to display");
    }
    protected  void displayNum(int n){
        System.out.println(n +" this is the number to display");
    }
    private void displayName(String s){
        System.out.println(s + "This is the name");
    }
}
class ObjectTes{
    public static void main(String[] args) throws NoSuchFieldException {
        Class obj = Eagle.class;
        System.out.println(obj.getName());

//        Class obj2 = null;
//        try {
//            obj2 = Class.forName("Eagle");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(obj2.getFields());
        System.out.println(obj.getFields());
    }
}
