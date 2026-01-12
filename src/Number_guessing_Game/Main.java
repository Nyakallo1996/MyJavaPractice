package Number_guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max +1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try again!");
            }
            else{
                System.out.println("Correct the number is " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }while(guess != randomNumber);

       scanner.close();
    }
}
