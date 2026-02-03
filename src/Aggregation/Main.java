package Aggregation;

public class Main {
    public static void main(String[] args){
        // Aggregation = Represents a "has-a" relationship between objects
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently

        Book book1 = new Book("Fellow of the ring", 425);
        Book book2 = new Book("Fellow of ", 425);
        Book book3 = new Book("Fellow of the ", 425);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC library", 2010, books);

        library.displayInfo();
    }
}
