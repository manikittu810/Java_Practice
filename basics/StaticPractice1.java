package InterviewPrep.basics;

public class StaticPractice1 {
    public static void  main(String[] args){
    StaticPractice obj = new StaticPractice();
    StaticPractice obj1 = new StaticPractice();

    //here you can access the static variable from class StaticPractice

        System.out.println(obj.staticVariable);
        System.out.println(obj1.staticVariable);

        // technically you can access static variables using the objects,
        //but avoided being a bad practice, developers often gets confused if it is followed like that
        System.out.println(StaticPractice.staticVariable);
        //This is a good practice of accessing the static variables from other calsses
        //using className.staticVariable

        obj.memberVariable = 1;
        obj1.memberVariable = 2; // here this object creation and its value is different from above
        System.out.println(obj.memberVariable + obj1.memberVariable);

        StaticPractice.staticVariable =200;
        // you can change the value of static variable of class1 in class2 after
        // creating an instance of class1 in class2
        obj.staticVariable =300; // this is masking the above value of static variable
        System.out.println(StaticPractice.staticVariable);
        System.out.println(obj.staticVariable);

        obj1.display();

    }
}