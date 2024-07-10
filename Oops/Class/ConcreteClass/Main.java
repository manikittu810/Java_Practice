package InterviewPrep.Oops.Class.ConcreteClass;

public class Main {
    public static void main(String[] args) {
        ConcreteClass obj1 = new ConcreteClass(4);
        obj1.setNum(3);
        obj1.getSquareArea();

        Rectangle obj2 = new Rectangle(4);
        obj2.setRectangle(2, 3);
        obj2.getRectangle();

        Triangle obj = new TriangleImpl();
        obj.setTriangle(3,5);
        obj.getTriangle();

        obj.setTriangle(4,5);
        obj.getTriangle();
    }
}
