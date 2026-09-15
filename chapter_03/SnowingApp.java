package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives 1/ the temperature and 2/ if it is raining.
 * The program decides whether it is snowing given that for snow
 * rain and temperature below zero are needed.
 */
public class SnowingApp {
    public static void main(String[] args) {

        // Define and Initialise variables
        Scanner scanner = new Scanner(System.in);

        double temp = 0.0;
        boolean isRaining = false;
        boolean isSnowing = false;

        // Perform logic operations
        System.out.println("Please give current temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Is it raining? ");
        isRaining = scanner.nextBoolean();

        isSnowing = (temp < 0) && isRaining;

        // Display output/results
        System.out.println("Snowing? " + isSnowing);
    }
}
