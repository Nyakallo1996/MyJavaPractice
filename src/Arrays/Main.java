package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"Apple", "Banana", "Orange", "Pineapple"};

        // getting length of array
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineaplles");

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);

        }
    }
}
