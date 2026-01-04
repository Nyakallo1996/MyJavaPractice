package CompoundInterestCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal; // orignal amount
        double rate; // interest rate
        int timesCompounded; // how often does our interest compound
        int years;
        double amount; // final amount

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " years is $" + amount);

        scanner.close();
    }
}
