package Overloaded_Methods;

public class Main {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        //System.out.println(add(4, 5, 10));

        String pizza = bakePizza("Flat bread ", "mozzarella");

        System.out.println(pizza);

    }

    /*static double add(double a, double b) {
         return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }*/

    static String bakePizza(String bread){
        return bread + "pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + "pizza" ;
    }
}
