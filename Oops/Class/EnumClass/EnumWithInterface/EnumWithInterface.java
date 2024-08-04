package InterviewPrep.Oops.Class.EnumClass.EnumWithInterface;

public enum EnumWithInterface implements ToLowerCase{
    MONDAY,TUESDAY,WEDNESDAY;
    @Override
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
class Test{
    public static void main(String[] args) {
        EnumWithInterface sample = EnumWithInterface.MONDAY;
        System.out.println(sample.toLowerCase());
        EnumWithInterface sample1 = EnumWithInterface.WEDNESDAY;
        System.out.println(sample1.toLowerCase());
        EnumWithInterface sample2 = EnumWithInterface.TUESDAY;
        System.out.println(sample2.toLowerCase());

    }
}
