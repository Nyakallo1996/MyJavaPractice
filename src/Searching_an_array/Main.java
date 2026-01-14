package Searching_an_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 5, 6, 8, 9, 3};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();
        //int target = 2;


        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }

        if(!isFound){
            System.out.println("Element no found in the array!");
        }

    }
}
