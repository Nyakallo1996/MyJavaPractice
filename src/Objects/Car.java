package Objects;

public class Car {
    // attributes

    String make = "ford";
    String model = "mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void drive(){
        System.out.println("You drive " + make + model + year);
    }
}
