package InterviewPrep.Interface.DefaultInInterface;

public interface InterfaceUsingStatic {
    static boolean canBreathe(){
        return true;
    }
}
class Man implements InterfaceUsingStatic{
    public void isMan(){
        if(InterfaceUsingStatic.canBreathe()){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }

    }
}
class Test2{
    public static void main(String[] args) {
        Man obj = new Man();
        obj.isMan();
    }
}
