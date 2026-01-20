package constructors;

public class Main {
    public static void main(String[] args){

        // constructors = A special method to initialize objects
        //                You can pass arguments to a constructor
        //                and set up initial values

        Students student1 = new Students("Nyakallo", 30, 3.2);
        Students students2 = new Students("Lehakoe", 24, 6.5);
        Students students3 = new Students("Tumi", 22, 3.6);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        student1.studying();
    }
}
