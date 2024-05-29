package InterviewPrep.Class;

public class Child2 extends Child1 {
    private String height;

    public Child2(String color, String nationality, int age, String language, String height) {
        super(color, nationality, age, language);
        this.height = height;
    }

    protected String getHeight() {
        return height;
    }

    @Override
    protected void printDetails() {
        System.out.println("Child2 details : Hair Color : " + getColor() + " Nationality : " + getNationality() + " child2 Age : " + getAge() + " Language :" + getLanguage() + " Height : " + getHeight());
    }

}
