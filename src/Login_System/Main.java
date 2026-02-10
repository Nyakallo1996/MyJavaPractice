package Login_System;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String userName = "nyakallo";
        int password = 123456;


        boolean isRunning = true;

        while(isRunning){

            String user;
            int userPassWord;




            System.out.print("Enter User Name: ");
            user = scanner.nextLine();

            System.out.print("Enter password: ");
            userPassWord = scanner.nextInt();

            if(userName.equals(user) && password == userPassWord){
                System.out.println("User does exists");
                break;

            }
            else {
                System.out.println("User does not exists");
            }
        }

        scanner.close();

    }
}
