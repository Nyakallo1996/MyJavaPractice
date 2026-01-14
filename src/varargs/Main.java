package varargs;

public class Main {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        System.out.println(average(1, 2, 6, 5, 8));

    }

    static double average(double... numbers){
        double sum = 0;

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
