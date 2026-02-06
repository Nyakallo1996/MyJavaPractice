package Student_Mark_Checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student mark to get grade: ");
        int studentMark = scanner.nextInt();

        if(studentMark >= 75){
            System.out.println("Student grade is A");
        }
        else if(studentMark >= 60 && studentMark < 74) {
            System.out.println("Student grade is B");

        } else if (studentMark >= 50 && studentMark < 59) {
            System.out.println("Student grade is C");
        }
        else {
            System.out.println("Student got an F");
        }


        scanner.close();
    }
}
