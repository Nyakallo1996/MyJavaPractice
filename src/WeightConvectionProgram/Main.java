package WeightConvectionProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM











        // else print not valid choice

        Scanner scanner = new Scanner(System.in);

        // Declare VARIABLES
        double weight;
        double newWeight;
        int choice;



        // welcome message
        System.out.println("Weight Convection Program");

        // prompt for user choice
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        // option 1 to convert lbs to kgs

        if(choice == 1){
            System.out.println("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        // option 2 convert kgs to lbs
        else if(choice == 2){
            System.out.println("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        // else print not valid choice
        else{
            System.out.println("Invalid option");
        }
    }
}
