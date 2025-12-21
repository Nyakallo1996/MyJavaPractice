package Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        //int number1;
        //int number2;
        //int number3;

       // int number;
       // double number2;

        //number1 = random.nextInt(1, 7);
        //number2 = random.nextInt(1, 7);
        //number3 = random.nextInt(1, 7);

        //number = random.nextInt(1,100);
        //number2 = random.nextDouble(1,100);


        //System.out.println(number1);
        //System.out.println(number2);
        //System.out.println(number3);

        //System.out.println(number);
        //System.out.println(number2);

        // Using random boolean

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }




}
