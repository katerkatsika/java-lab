package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα menu με επιλογές και
 * να ελέγχει την επιλογή με if/then/else.
 */
public class MenuIf {

    public static void main(String[] args) {
        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Perform logic operations
        while (true) {
            System.out.println("Choose one of the following: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Wrong number! Choose again.");
                continue;
                // If we write return; instead of continue; that would terminate
                // the program (it will exit the entire main method)
                // after only one invalid iput.
            }
            if (choice == 5) {
                System.out.println("Thank you!");
                break;
            }

            if (choice == 1) {
                System.out.println("Η εισαγωγή έγινε επιτυχώς!");
            } else if (choice == 2) {
                System.out.println("Η ενημέρωση έγινε επιτυχώς!");
            } else if (choice == 3) {
                System.out.println("Η διαγραφή έγινε επιτυχώς!");
            } else {
                System.out.println("Η αναζήτηση έγινε επιτυχώς!");
            }
        }
        scanner.close();
    }
}

