package InterviewPrep.Oops.Polymorphism;

class A{
    int doSum(int a,int b){
        return a+b;
    }
     int doSum(int a,int b,int c){
        return a*b/c;
    }
    int doSum(int a,String b){

        return a+Integer.parseInt(b);
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.doSum(1,2));
        System.out.println(obj.doSum(3,'A'));
        System.out.println(obj.doSum(100,797423));
        System.out.println(obj.doSum(100,2,10));

    }

}
