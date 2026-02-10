package Student_Manangement;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student student = new Student(id, name, age, marks);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewStudent();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = scanner.nextDouble();

                    manager.updateMarks(updateId, newMarks);
                    break;

                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();


    }
}
