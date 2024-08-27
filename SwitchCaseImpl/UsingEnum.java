package InterviewPrep.SwitchCaseImpl;

public enum UsingEnum {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public static void main(String[] args) {
        UsingEnum obj = UsingEnum.MONDAY;
        int outputVal = 0;
        switch(obj){
            case MONDAY :
                outputVal=1;
                break;
            case TUESDAY:
                outputVal=2;
                break;
            case WEDNESDAY:
                outputVal=3;
                break;
            default:
                outputVal=-1;
                break;
        }
        System.out.println(outputVal);
    }
}

