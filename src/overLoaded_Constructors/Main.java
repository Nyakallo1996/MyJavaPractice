package overLoaded_Constructors;

public class Main {
    public static void main(String[] args){

        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.

        User user1 = new User("Nyakallo");
        User user2 = new User("Bhele", "mallia@gmail,com", 40);
        System.out.println(user1.username);
        System.out.println(user2.email);
    }
}
