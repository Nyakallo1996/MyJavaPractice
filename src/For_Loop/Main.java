package For_Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for loop = execute some code a certain amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
