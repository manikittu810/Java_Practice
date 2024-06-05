package InterviewPrep.basics;

public class StaticPractice {
    StaticPractice(){ // default constructor

    }
    int a;
    StaticPractice(int a){ //parameterized constructor
    this.a =a;
        System.out.println("Parameterized constructor called : " + this.a);
    }
int memberVariable; // member variable
static int staticVariable =100;//static variable or class variable
     public void dummy(){
         byte localVariable =10;//local variable
         System.out.println(localVariable);
    }

    //method parameter
     public int methodDummy2(int a, int b){
         return a+b;
     }
    // we can also change the value of static variable of
    // same class in the same class using the className.staticVariable

    public void display(){
         StaticPractice.staticVariable =500;
        System.out.println(StaticPractice.staticVariable);
    }



}