package Enhanced_Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if Statements
        //           (Java14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week : ");
        String day = scanner.nextLine();

        switch (day) {
           // case "Monday" -> System.out.println("Its a weekday ");
           // case "Tuesday" -> System.out.println("Its a weekday ");
           // case "Wednesday" -> System.out.println("Its a weekday ");
           // case "Thursday" -> System.out.println("Its a weekday ");
           // case "Friday" -> System.out.println("Its a weekday ");
           // case "Saturday" -> System.out.println("Its a weekend ");
           // case "Sunday" -> System.out.println("Its a weekend ");

            // to make this shorter we can use commas since the output from monday to friday is the same

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("its a week day");
            case "Saturday", "Sunday" -> System.out.println("its a weekend");
            default -> System.out.println(day + " Its not a day ");


        }
    }
}
