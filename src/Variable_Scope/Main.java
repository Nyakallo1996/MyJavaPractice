package Variable_Scope;

public class Main {

    static int x = 3; // Class

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        //int x = 1; // this is a local variable

        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        //int x = 2;
        System.out.println(x);
    }
}
