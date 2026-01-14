package Pizza_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Creating an empty array that has space for three elements
        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        // Adding elements to our array
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }


        for(String food : foods){
            System.out.println(food);
        }



        scanner.close();
    }
}
