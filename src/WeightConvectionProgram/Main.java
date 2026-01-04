package WeightConvectionProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        // Declare VARIABLES

        // welcome message

        // prompt for user choice

        // option 1 to convert lbs to kgs

        // option 2 convert kgs to lbs

        // else print not valid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Convection Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter weight in lbs: ");
        }
    }
}
