package Banking_Program;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES



        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU

        while (isRunning) {
            System.out.println("**************");
            System.out.println("Welcome to Banking Program");
            System.out.println("**************");
            System.out.println("1. Show Balance");
            System.out.println("**************");
            System.out.println("2. Deposit");
            System.out.println("**************");
            System.out.println("3. Withdraw");
            System.out.println("**************");
            System.out.println("4. Exit");



            // GET AND PROCESS USERS CHOICE

            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }

        System.out.println("**************");
        System.out.println("Thank you for using Banking Program");


        scanner.close();













        // EXIT MESSAGE

    }

    // showBalance()
    static void showBalance(double balance) {
        System.out.println("**************");
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    static double deposit(){
        double amount;

        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can not be negative");
            return 0;
        }
        else{
            return amount;
        }


    }

    // withdraw()
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can not be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
