package InterviewPrep.Class;

public  class Speed implements Abstraction, Abstraction1 {
    protected int speed;
    Speed(int s){

        speed = s ;
    }

    @Override
    public int DecreaseSpeed(int s) {
        if(this.speed - s >=0){
            this.speed -= s;
        }
        else{
    this.speed = 0;
        }
        return this.speed;
    }

    @Override
    public int IncreaseSpeed(int s) {
        if(this.speed+s <=120){
            this.speed += s;
        }
        else{
            this.speed = 120;
        }
        return this.speed;
    }

    public static void main(String[] args) {
        Speed obj1 = new Speed(20);
        System.out.println("Decreased Speed : " + obj1.DecreaseSpeed(10));
        System.out.println("Increased Speed : " + obj1.IncreaseSpeed(20));

        System.out.println("Decreased Speed : " + obj1.DecreaseSpeed(10));
        System.out.println("Increased Speed : " + obj1.IncreaseSpeed(80));



    }
}
