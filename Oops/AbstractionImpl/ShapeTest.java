package InterviewPrep.Oops.AbstractionImpl;

abstract class Shape {
    String color;
    //the below are the abstract methods
    abstract double area();
      public abstract String toString();

     //abstract class constructor

    public Shape(String color){
        System.out.println("Shape constructor called ");
        this.color = color;
    }

    public String getColor(){
    return color;
    }
}
class Circle extends Shape{
    int radius;
    public Circle(String color,int r){
        super(color);
        System.out.println("Rectangle constructor called");
        this.radius=r;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return super.getColor();
    }
}
class Rectangle extends Shape{
    int length, breadth;

    public Rectangle(String color,int length,int breadth){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.breadth= breadth;
    }

    @Override
    double area() {
        return length*breadth;
    }
    @Override
    public String toString(){
        return super.getColor();
    }
}
public class ShapeTest{
    public static void main(String[] args){
        Shape circle = new Circle("red",10);
        Shape rec = new Rectangle("Grey",10,8);

        System.out.println(circle.toString());
        System.out.println(rec.toString());
        System.out.println( "circle area : " +circle.area());
        System.out.println("Rectangle Area : "+rec.area());


    }
}