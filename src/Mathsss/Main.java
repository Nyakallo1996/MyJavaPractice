package Mathsss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //double result;

        //result = Math.pow(2,3);
        //result = Math.abs(-5);
        //result = Math.sqrt(9);

        //System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        //Scanner sc = new Scanner(System.in);

        //double a;
        //double b;
        //double c;

        //System.out.println("Enter the length of side A: ");
        //a = sc.nextDouble();

        //System.out.println("Enter the length of side B: ");
        //b = sc.nextDouble();

        //c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        //System.out.println("The hyptenuse (side c) is: " + c + "cm");

        //sc.close();

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        System.out.println("Circumference: " + circumference);

        scanner.close();
    }
}
