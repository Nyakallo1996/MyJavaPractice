package Getters_and_Setters;

public class Car {

    private String model;
    private String colour;
    private int price;

    Car(String model, String colour, int price){
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColour(){
        return this.colour;
    }

    int getPrice(){
        return this.price;
    }

    void setColour(String colour){
        this.colour = colour;
    }

    void setPrice(int price){
        this.price = price;
    }
}
