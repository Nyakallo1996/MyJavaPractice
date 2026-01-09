package Ternary_operator;

public class Main {
    public static void main(String[] args) {

        // ternary operator ? Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        //int score = 100;

        //String passOrFail = (score >= 60) ? "pass" : "fail";

        //int number = 50;

        //String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        //int hours = 13;

        //String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        int income = 20000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
