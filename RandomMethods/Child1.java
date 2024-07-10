package InterviewPrep.RandomMethods;

public class Child1 extends Parent {
    private String language;

    public Child1(String color, String nationality, int age, String language) {
        super(color, nationality, age);
        this.language = language;
    }
    protected String getLanguage(){
        return language;
    }
    @Override
    protected void printDetails() {
        System.out.println("Child1 details : Hair Color : " + getColor() + " Nationality : " + getNationality() + " child1 Age : " + getAge() + " Language :" + getLanguage());
    }

}
