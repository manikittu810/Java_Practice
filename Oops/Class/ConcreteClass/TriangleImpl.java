package InterviewPrep.Oops.Class.ConcreteClass;

public class TriangleImpl implements Triangle {
    int b, h;
    float area = 0;

    public TriangleImpl(){
    }

    @Override
    public void setTriangle(int b, int h) {
        this.b = b;
        this.h = h;
        area = (float) (0.5) * b * h;
    }

    @Override
    public int getTriangle() {
        System.out.println("The are of triangle is : " + area);
    return (int)area;
    }
}