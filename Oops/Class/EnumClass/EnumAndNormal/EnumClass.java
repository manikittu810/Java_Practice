package InterviewPrep.Oops.Class.EnumClass.EnumAndNormal;

public enum EnumClass {
        SUNDAY,MONDAY
}

class Test{
    public static void main(String[] args) {
        System.out.println(isWeekend(2));
        System.out.println(isWeekend(1));
        System.out.println(isWeekend(EnumClass.SUNDAY));
        System.out.println(isWeekend(EnumClass.MONDAY));
    }
    public static boolean isWeekend(int day){
        return NormalClass.SUNDAY == day || NormalClass.MONDAY == day;
    }
    public static boolean isWeekend(EnumClass day){
        return EnumClass.MONDAY==day || EnumClass.SUNDAY==day;

    }
}
