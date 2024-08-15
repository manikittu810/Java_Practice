package InterviewPrep.Interface.FunctionalInterfaceAndLambdaExpression.types.FunctionalInterface3;

@FunctionalInterface
public interface Bird {
    void isBird(String name);
    static String isBird1(String name)
    {
        System.out.println("declared in interface as  static method and called in main method: " + name);
        return name;
    }
}
class Test{
    public static void main(String[] args) {
        Bird obj = (String s) -> System.out.println("Using Lambda Expression, the Bird is : " + s);
        obj.isBird("Eagle");
        System.out.println(Bird.isBird1("Peacock"));
    }
}
