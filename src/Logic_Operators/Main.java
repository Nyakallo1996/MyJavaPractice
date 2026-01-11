package Logic_Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT .Checks the opposite checks if something is not true.

        // Checking the weather

       /* double temp = -10;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is Good ");
            System.out.println("Sunny");

        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is Good ");
            System.out.println("It is Cloudy outside ");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad ");
        } */

        // Validating a user_name

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters");
        }
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username cannot contain spaces or underscore");
        }
        else{
            System.out.println("Welcome user: " + username);
        }

        scanner.close();

    }
}
