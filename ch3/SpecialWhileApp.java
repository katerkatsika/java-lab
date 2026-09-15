package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ειδικές - ακραίες περιπτώσεις (edge cases) της while.
 */
public class SpecialWhileApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (i <= 0) System.out.println("Δε μπαίνει ποτέ μέσα στη while");

        while (scanner.nextInt() != -1); // απλώς καταναλώνει το input μέχρι να βρει το -1.

        while (i <= 1) {
            System.out.println("Τρέχει μία μόνον φορά");
            i++;
        }

        while (true) {
            System.out.println("Εκτελείται αενάως");
        }
    }
}
