package CountDown_App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();


        for(int i = start; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Happy New Year");
    }
}
