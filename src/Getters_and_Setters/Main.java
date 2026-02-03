package Getters_and_Setters;

public class Main {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // Getters = methods that make a field READABLE.
        // Setters = methods that make a field WRITEABLE.

        Car car = new Car("Toyota", "black", 50000);

        car.setColour("Red");

        System.out.println(car.getColour());
    }
}
