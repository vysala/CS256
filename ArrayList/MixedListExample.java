package ArrayListPgms;

import java.util.ArrayList;

public class MixedListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add("Hello");    // String
        list.add(42);         // Integer
        list.add(3.14);       // Double
        list.add(true);       // Boolean

        for (Object item : list) {
            System.out.println(item);
        }
    }
}
