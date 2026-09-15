package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει εξακολουθητικά ένα μενού μέχρι
 * ο χρήστης να δώσει 'έξοδο'.
 */
public class MenuApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 3;


        while (true) {
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφή Προϊόντος");
            System.out.println("3. Έξοδος");
            System.out.println("Please make a choice:");
            choice = scanner.nextInt();
            if (choice == EXIT) break;
        }

        System.out.println("Thank you for your preference to our services!");
    }
}
