package InterviewPrep.Oops.Class.EnumClass;

public enum MethodOverrideByConstant {
    MONDAY {
        @Override
        public void print() {
            System.out.println("But not for monday");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void print(){
        System.out.println("This default for all the above constants");
    }
}
class Test1{
    public static void main(String[] args) {
        MethodOverrideByConstant sample = MethodOverrideByConstant.FRIDAY;
        sample.print();
        MethodOverrideByConstant sample1 = MethodOverrideByConstant.MONDAY;
        sample1.print();

    }
}
