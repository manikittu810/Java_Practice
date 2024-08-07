package InterviewPrep.Interface.NestedInterface;

public interface Bird {
    void canFly();
     interface NotBird{
        void cannotFly();
    }
}
class Eagle implements Bird{
    @Override
    public void canFly(){
        System.out.println("Eagle This is the implementation of interface Bird->Bird Flies");
    }
}
class Eagle1 implements Bird.NotBird{
    @Override
    public void cannotFly(){
        System.out.println("Eagle1 This is the implementation of interface NotBird->Bird cannot Fly");
    }
}
class BothImplement implements Bird,Bird.NotBird{
    @Override
    public void cannotFly(){
        System.out.println("cannotFly Method -> Nested Interface -> this method Overrides all the above cannotFly method  Implementations");
    }

    @Override
    public void canFly(){
        System.out.println("canFly Method ->  Interface -> this methodOverrides al the above canFly Method implementations");
    }
}
class Test{
    public static void main(String[] args) {
        Bird obj = new BothImplement();
        obj.canFly();
        Bird.NotBird obj3 = new BothImplement();
        obj3.cannotFly();
        Bird obj1 = new Eagle();
        obj1.canFly();
        Bird.NotBird obj2 = new Eagle1();
        obj2.cannotFly();
    }
}