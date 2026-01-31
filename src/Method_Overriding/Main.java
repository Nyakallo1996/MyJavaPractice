package Method_Overriding;

public class Main {
    public static void main(String[] args){
        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined
        //                     Allows for code reusability and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        fish.move();
    }
}
