package gr.aueb.cf.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create a list and add some colors to the list
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        // Print the list
        System.out.println(list_Strings);

        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");
        int last = list_Strings.size();
        list_Strings.add(last, "Yellow");

        // Print the list
        System.out.println(list_Strings);
        System.out.println("Δώσε το χρώμα:");
        String colour = in.next();
        if (list_Strings.contains(colour)) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }

}
