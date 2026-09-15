package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει εξακολουθητικά ένα μενού μέχρι
 * ο χρήστης να δώσει 'έξοδο'.
 */
public class  MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 3;
        int choice = 0;

        do {
            System.out.println("Please choose one of the following: ");
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφή Προϊόντος");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != EXIT);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");
    }
}
