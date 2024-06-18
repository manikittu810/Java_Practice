package InterviewPrep.Oops.Relationships;

class Engine{
    private String engineType;
    public Engine(String type){
        this.engineType=type;
    }
    public String throwEngineType(){
        return engineType;
    }
    public void start(){
        System.out.println("Engine Type : " + engineType);
    }
}
class Car{
    private String model;
    private Engine engine; //creating a class reference

    public Car(Engine engine,String model){
        this.engine= engine;
        this.model = model;
    }
    public void startCar(){
        System.out.println("Starting car : " + model);
        engine.start();
    }

    public String  getEngineType(){
        return engine.throwEngineType();
    }
    public String getModel(){
        return model;
    }
}
public class Composition {
    public static void main(String[] args){
        Engine engine= new Engine("V8");
        Car obj = new Car(engine, "Mustang");

        obj.startCar();;
        System.out.println(obj.getEngineType());
        System.out.println(obj.getModel());
    }
}
