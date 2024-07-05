package InterviewPrep.Oops.MM;

import InterviewPrep.Oops.Class.FinalMethod.Person;

public class MemoryManagement {
    private void memoryManagement(Person obj){
        Person personObj2 = obj;
        String StringLiteral2 = "24";
        String StringLiteral3 = new String("23");

    }
    public static void main(String[] args){
        int primitiveVariable = 10;
        Person personObj = new Person() {
            @Override
            protected int print() {
                return 0;
            }
        };
        String StringLiteral = "24";
        MemoryManagement obj = new MemoryManagement();
        obj.memoryManagement(personObj);
    }
}