package Dice_Roller_Program;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();



        // DECLARE VARIABLES

        int numOfDice;
        int total = 0;

        // GET # OF DICE FROM THE USER

        System.out.print("Enter the number of dice: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You have rolled " + roll + ".");
                total += roll;
            }

            System.out.println("You have rolled " + total + ".");
        }
        else{
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();


        // CHECK IF # OF DICE > 0
        // ROLL ALL THE DICE
        // GET THE TOTAL
        // DISPLAY ASCII OF DICE
    }

    static void printDie(int roll){

        String dice1 = """
                -------
               |        |
                """;
    }
}
