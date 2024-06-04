package InterviewPrep.basics;

public class StaticPractice {
    StaticPractice(){ // default constructor

    }
    StaticPractice(int a){ //parameterized constructor

    }
int memberVariable; // member variable
static int staticVariable =100;//static variable or class variable
     public void dummy(){
         byte localVariable =10;//local variable
         System.out.println(localVariable);
    }

    //method parameter
     public int methdDummy2(int a, int b){
         return a+b;
     }
    // we can also change the value of static variable of
    // same class in the same class using the className.staticVariable

    public void display(){
         StaticPractice.staticVariable =500;
        System.out.println(StaticPractice.staticVariable);
    }



}