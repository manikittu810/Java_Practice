package InterviewPrep.deepCopy;

import java.security.PublicKey;

public class Address {
    String address;
    Address(String address){
        this.address=address;
    }
}

class Person{
    String name;
    Address address;
     Person(String name,Address address){
        this.name=name;
        this.address=address;
    }
}

class TestDeepCopy{
    public static void main(String[] args) {
        Address obj1 = new Address("NewYork");
        Person obj2 = new Person("Smk",obj1);

        System.out.println(obj2.address.address);

        Address copiedAddress = new Address(obj1.address);
        Person deepCopy = new Person(obj2.name, copiedAddress);
        System.out.println(deepCopy.address.address);
        deepCopy.address.address="LosAngeles";
        System.out.println("deepcopy : " + deepCopy.address.address);

    }
}