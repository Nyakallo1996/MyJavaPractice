package userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the name of the user: ");
         String name = scanner.nextLine();

         System.out.println("Enter your age: ");
         int age = scanner.nextInt();

        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is: " + gpa);

         scanner.close();
    }
}
