package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Input / Output of Strings
 */
public class StringIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert s1: ");
        s1 = scanner.next();

        System.out.println("Please insert s2: ");
        s2 = scanner.nextLine();

        System.out.printf("s1: %s \n",  s1);
        System.out.printf("s2: %s \n",  s2);

        // scanner.next(); -->  Διαβάζει μέχρι να βρει white space (i.e.: space, tab or new line)
        // scanner.nextLine(); --> Διαβάζει μέχρι να βρει new line ('καταναλώνει' δλδ τα spaces και τα tabs)
                                // μέχρι δλδ τυπικά να πατήσουμε Enter.
    }
}
