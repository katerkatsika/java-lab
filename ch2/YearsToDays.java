package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * The user gives their age in years and the program computes the equivalent in days.
 */
public class YearsToDays {
    public static void main(String[] args) {
        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int ageInYears = 0;
        int ageInDays = 0;
        final int YEAR_TO_DAYS = 365;


        // Perform logic operations
        System.out.println("Please give the number of ageInYears: ");
        ageInYears = scanner.nextInt();
        ageInDays = ageInYears * YEAR_TO_DAYS;

        // Display output/results
        System.out.printf("%d years of age are %d days.", ageInYears, ageInDays);

        scanner.close();
    }
}
