package InterviewPrep.Oops.ConstructorChaining.UseSuper;

public class SubClass extends ChainSuper {
    String name;
    SubClass(String name, int empId) {
        super(empId);
        System.out.println(empId);
        System.out.println("called subclass");

        this.name = name;
    }
}
