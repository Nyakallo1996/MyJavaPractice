package String_Methods;

public class Main {
    public static void main(String[] args) {

        String name = "Nyakallo Mahlakametsa";

        int length = name.length(); // Finding the total length of the name string
        char letter = name.charAt(3); // Find the letter of a given index in the name string
        int index = name.indexOf("N"); // finding the index of the letter within a string

        //name = name.toUpperCase();
          name = name.toLowerCase();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(name);
    }
}
