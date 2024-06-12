package InterviewPrep.ReferenceDataTypes;

public class Strings {
    public static void main(String[] args){
        String s1 ="Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);//Here these two s1 and s3 points to different memory locations in the heap,
        // even though the value is same, because , when we use 'new' in creating a string, it creates a new memory location
        //with a given value in the string. That is why it returns false.
        System.out.println(s1.equals(s3));
        s1 ="Hello mk"; // here s1 is deferenced from the value "Hello , and referenced to "Hello mk" in the string constant pool
        //in th heap , but the old valueof s1 which is "Hello" still exists in the Heap->String Constant Pool.
        //concept reference - Shrayansh Jain YT-> Variable DataTypes part 2


    }
}
