package InterviewPrep.Oops.Class.EnumClass;

public enum EnumWithCustomValues {
    MONDAY(101,"Its monday"),
    TUESDAY(102,"Its Tuesday"),
    WEDNESDAY(103,"Its wednesday"),
    THURSDAY(104,"its thursday"),
    FRIDAY(105,"its friday"),
    SATURDAY(106,"Its saturday"),
    SUNDAY(107,"Its sunday");

    private final int num;
    private final String comment;
    EnumWithCustomValues(int n,String s){
        this.num=n;
        this.comment=s;
    }
    public String getComment(){
        return comment;
    }
    public int getNum(){
        return num;
    }
    public static EnumWithCustomValues getNumIfTrue(int val){
        for(EnumWithCustomValues sample : EnumWithCustomValues.values()){
            if(sample.num == val){
                return sample;
            }
        }
        return null;
    }
}
class Test{
    public static void main(String[] args) {
        EnumWithCustomValues sample = EnumWithCustomValues.getNumIfTrue(108);
        if(sample!=null){
            System.out.println(sample);
            System.out.println(sample.getComment());
            System.out.println(sample.getNum());
        }
        else{
            System.out.println("sample is pointing to null");
        }

    }
}