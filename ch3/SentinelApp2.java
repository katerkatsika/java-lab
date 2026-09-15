package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User provides with integer numbers (through stdio) until -1 shows up.
 * It counts the total counts.
 */
public class SentinelApp2 {

    public static void main(String[] args) {

        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // while/do
        System.out.println("Please enter an integer.");

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Give the next integer: ");
        }

        // Display total counts
        System.out.printf("Total counts = %d. \n", iterations);
    }
}
