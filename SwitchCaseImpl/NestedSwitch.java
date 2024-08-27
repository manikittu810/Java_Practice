package InterviewPrep.SwitchCaseImpl;

public enum NestedSwitch {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
        public static void main(String[] args) {
            NestedSwitch obj = NestedSwitch.MONDAY;
            int outputVal = 0;
            switch(obj){
                case MONDAY :
                    outputVal=1;
                    switch(outputVal){
                        case 1 :
                            System.out.println("val is " + 1);
                            break;
                        case 2:
                            System.out.println("val is " + 2);
                            break;
                        default:
                            System.out.println("default");
                            break;
                    }
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