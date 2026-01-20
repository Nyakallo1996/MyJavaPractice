package Objects;

public class Main {
    public static void main(String[] args){

        // Object = an entity that holds data (attributes)
        //          and can perform actions (methods)
        //          it is a reference data type

        Car car = new Car();

        System.out.println(car.model);
        car.drive();

    }
}
