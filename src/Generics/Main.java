package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with
        //            <String> type argument (specifies that type)


       /* Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box2.setItem(5);

        System.out.println(box2.getItem());*/

        Product<String, Double> product = new Product<>("Shoe", 5.22);
    }
}
