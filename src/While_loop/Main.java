package While_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // While loop = repeat some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        /*String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game ");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();

        }

        System.out.println("You have quit the game");

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0 || age == 0){
            System.out.println("Your age cannot be negative or zero");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your age is " + age);*/

        int number = 0;

        do {
            System.out.println("Enter a number between 1 and 10");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number + " number");

        scanner.close();
    }
}
