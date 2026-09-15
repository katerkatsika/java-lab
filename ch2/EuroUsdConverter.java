package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads users' input in Euros and converts it to US Dollars.
 * (The rating is 99 USDcents = 1 Euro)
 * Finally it prints the result.
 */
public class EuroUsdConverter {
    public static void main(String[] args) {
        // Initialisation / Declarations
        Scanner scanner = new Scanner(System.in);

        float euros = 0;
        final int EUROS_TO_USD = 99;
        float dollarsTotalCents = 0;
        int usDollars = 0;
        int usCents = 0;

        // Perform operations
        System.out.println("Please give the amount in Euros: ");
        euros = scanner.nextFloat();
        dollarsTotalCents = euros * EUROS_TO_USD;
        usDollars = (int) (dollarsTotalCents / 100);
        usCents = (int) (dollarsTotalCents % 100);

        // Display output
        System.out.printf("%.2f \u20AC are \u0024 %d,%02d \n", euros, usDollars, usCents);
        scanner.close();

    }
}
