package AcceptingUserInput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = (width * height) / 2;

        System.out.println("Area is " + area);

        scanner.close();
    }
}
