package Inheritance;

public class Main {
    public static void main(String[] args){

        //Inheritance = one class inherits the attributes and methods
        //              from another class.
        //              child <- Parent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        cat.eat();
        plant.phototsynthesize();
    }
}
