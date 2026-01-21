package Static;

public class Main {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Nyakallo");
        Friend friend2 = new Friend("Tumisang");
        Friend friend3 = new Friend("Hakoe");
        Friend friend4 = new Friend("James");

        System.out.println(Friend.numberOfFriends);
        Friend.showFriends();
    }
}
