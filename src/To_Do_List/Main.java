package To_Do_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String task;
        boolean isRunning = true;

        ArrayList<String> list = new ArrayList<>();





        while(isRunning){

            String answer;

            System.out.print("Enter a task: ");
            task = scanner.nextLine();
            list.add(task);
            System.out.println(list);

            System.out.print("Do you want to add another task? (Yes/No)");
            answer = scanner.nextLine().toUpperCase();
            if(answer.equals("NO")){
                break;

            }
        }





        scanner.close();
    }
}
