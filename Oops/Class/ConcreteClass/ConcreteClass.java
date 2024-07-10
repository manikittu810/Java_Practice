package InterviewPrep.Oops.Class.ConcreteClass;

class ConcreteClass {
    int num;
    int area = 0;
    public ConcreteClass(int num){
        this.num = num;
        setNum(num);
    }


    public void setNum(int num){
        this.num = num;
        area = num*num;
    }
    public int getSquareArea(){
        System.out.println("the square of the number is : "+ area);
        return area;
    }
}
