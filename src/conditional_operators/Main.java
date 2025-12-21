package conditional_operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         // if statement = performs a block of code if its condition is true

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = input.nextBoolean();

        //Group 1
        if (name.isEmpty()) {
            System.out.println("You did not enter a name.");
            
        } else {
            System.out.println("You are " + name + ".");
            
        }

        //Group 2

        if (age >= 70) {
            System.out.println("You are a senior");
        }
        else if (age >= 18) {
            System.out.println("You are an adult");
        }
        else if (age < 0) {
            System.out.println("You are not born yet");
        }
        else {
            System.out.println("You are a child");
        }

        //Group 3
        if (isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }

        input.close();

    }
}
