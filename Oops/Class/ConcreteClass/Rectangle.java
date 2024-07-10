package InterviewPrep.Oops.Class.ConcreteClass;

public class Rectangle extends ConcreteClass {
    int area =0;

    public  Rectangle(int num) {
        super(num);
    }

    public void setRectangle(int num,int len){
         area  = num * len;
    }
    public int getRectangle(){
        System.out.println("Area of the rectangle is  : " + area);
        return area;
    }
}
