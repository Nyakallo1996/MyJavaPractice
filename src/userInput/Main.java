package userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the name of the user: ");
         String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

         scanner.close();
    }
}
