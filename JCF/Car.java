package InterviewPrep.JCF;

import java.util.*;

public class Car implements Comparator<Car>{
    String carName;
    String carType;
    Car(){

    }
    Car(String carName,String carType){
        this.carName=carName;
        this.carType = carType;
    }
    @Override
    public int compare(Car o1,Car o2){
        return o1.carType.compareTo(o2.carType);
    }
}
//class CarNameComparator implements Comparator<Car>{
//    @Override
//    public int compare(Car o1,Car o2){
//    return o1.carType.compareTo(o2.carType);
//    }
//}
class Test{
    public static void main(String[] args) {
        Car[] obj = new Car[3];
        obj[0] = new Car("Benz","Petrol");
        obj[1] = new Car("Tesla","EV");
        obj[2] = new Car("Maruti 800","Diesel");

        Arrays.sort(obj,(Car o1,Car o2) -> o1.carName.compareTo(o2.carName));

        for(Car x : obj){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Arrays.sort(obj,(Car o1,Car o2) -> o2.carName.compareTo(o1.carName));
        for(Car x : obj){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Arrays.sort(obj,(Car o1,Car o2) -> o2.carType.compareTo(o1.carType));
        for(Car x : obj){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Arrays.sort(obj,(Car o1,Car o2) -> o1.carType.compareTo(o2.carType));
        for(Car x : obj){
            System.out.println(x.carName+"...."+x.carType);
        }
    List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche","EV"));
        cars.add(new Car("Ford","Gas"));
        cars.add(new Car("Auto rickshaw","petrol"));

        Collections.sort(cars,(Car o1, Car o2) -> o1.carName.compareTo(o2.carName));

        for(Car x : cars){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Collections.sort(cars,(Car o1,Car o2) -> o2.carName.compareTo(o1.carName));
        for(Car x : cars){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Collections.sort(cars,(Car o1,Car o2) -> o2.carType.compareTo(o1.carType));
        for(Car x : cars){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();
        Collections.sort(cars,(Car o1,Car o2) -> o1.carType.compareTo(o2.carType));
        for(Car x : cars){
            System.out.println(x.carName+"...."+x.carType);
        }
        System.out.println();

//        Collections.sort(cars,new CarNameComparator());
//        cars.forEach((Car o) -> System.out.println(o.carName + " ..... "+ o.carType));
        Collections.sort(cars,new Car());
        cars.forEach((Car o) -> System.out.println(o.carName + " ..... "+ o.carType));


    }
}