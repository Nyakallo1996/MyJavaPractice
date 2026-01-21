package Array_Of_Objects;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car("Mustang", "blue");
        Car car2 = new Car("Rav4", "Cherry");
        Car car3 = new Car("M340i", "Ice White");

        Car[] cars = {car1, car2, car3};

        for(Car car : cars){
            car.drive();
        }
    }
}
