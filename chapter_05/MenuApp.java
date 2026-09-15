package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών με
 * τη χρήση μεθόδων αυτή τη φορά.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // print the menu
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Επιτυχής Εισαγωγή!");
                case 2 -> System.out.println("Επιτυχής Διαγραφή!");
                case 3 -> System.out.println("Επιτυχής Ενημέρωση!");
                case 4 -> System.out.println("Επιτυχής Αναζήτηση!");
                case 5 -> System.out.println("Επιτυχής Έξοδος!");
                default -> System.out.println("Λάθος Επιλογή!");
            }
        } while (choice != 5); // 5 is for Exit
    }

    public static void printMenu () {
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }
}
