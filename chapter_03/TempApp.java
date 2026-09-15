package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Receives a temperature from the user and responds with a
 * message whether this temperature is below zero (0).
 */
public class TempApp {
    public static void main(String[] args) {
        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        double temp = 0.0;
        boolean isFreezing = false;

        // Perform logic operations
        System.out.println("Please give a temperature: ");
        temp = scanner.nextDouble();
        isFreezing = temp < 0;

        // Display output/results
        System.out.println("Do we have freezing temperatures? " + isFreezing);
    }
}
