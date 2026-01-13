package Methods;

public class Main {
    public static void main(String[] args) {

        // methods = a block of reusable code that is executed when called ()

       // String name = "Spongebob";
       // int age = 30;

        //happyBirthday(name, age);

        //double result = square(3);
        System.out.println(cube(3));

        String fullName = getFullName("John", "Smith");
        System.out.println(fullName);
        System.out.println(ageCheck(12));



    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){

        if(age >= 18){
            return true;
        }
        else {
            return false;
        }

    }

}
