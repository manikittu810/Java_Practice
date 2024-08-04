package InterviewPrep.Oops.Class.EnumClass;

public enum AbstractWithEnum {
    MONDAY{
        public  void dummyM(){
            System.out.println("dummyMethod from monday");
        }
    },TUESDAY{
        public  void dummyM(){
            System.out.println("dummyMethod from Tuesday");
        }
    },WEDNESDAY{
        public  void dummyM(){
            System.out.println("dummyMethod from wednesday");
        }
    };
    public abstract void dummyM();
}

class Test2{
    public static void main(String[] args) {
        AbstractWithEnum sample = AbstractWithEnum.MONDAY;
        sample.dummyM();
        AbstractWithEnum sample1 = AbstractWithEnum.TUESDAY;
        sample1.dummyM();
        AbstractWithEnum sample2 = AbstractWithEnum.WEDNESDAY;
        sample2.dummyM();


    }
}