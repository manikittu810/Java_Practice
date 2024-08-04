package InterviewPrep.Oops.Class.EnumClass;

public  enum EnumClass {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
class Main{
    public static void main(String[] args) {
        //when using enum class we need to know how to use it with
        //values(),ordinal(),valueOf(),name()
        //usage of values() and ordinal()
        for(EnumClass obj : EnumClass.values()){
            System.out.println(obj.ordinal());
        }

        //usage of valueOf() and name()
       EnumClass obj1 = EnumClass.valueOf("SUNDAY");
        System.out.println(obj1.name());
    }
}
