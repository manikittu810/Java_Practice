package InterviewPrep.RandomMethods;

public class Parent {
    String color;
    String nationality;
    int age;
    Parent(String c,String n, int a){
        color = c;
        nationality=n;
        age=a;
    }
    protected void setColor(String c){
        this.color = c;
    }
    protected void setNationality(String n){
        this.nationality = n;
    }
    protected void setAge(int a){
        this.age = a;
    }
    protected String getColor(){
        return color;
    }
    protected String getNationality(){
        return nationality;
    }
    protected int getAge(){
        return age;
    }
    protected void printDetails(){
        System.out.println("Parent details : Hair color : " + getColor() + " Nationality : " + getNationality()+ " Parent Age : " + getAge());
    }
}

//always execute parent,child1,child2,child3 together 
