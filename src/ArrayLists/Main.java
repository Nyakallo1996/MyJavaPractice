package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> list = new ArrayList();

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");
        list.add("Tomato");

        //list.remove(0);
        list.set(0, "Pineapple");

        //System.out.println(list.get(0));
        //System.out.println(list.size());

        Collections.sort(list);

        System.out.println(list);
    }
}
