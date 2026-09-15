package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVAT {
    public static void main(String[] args) {

        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        double priceBeforeTax = 0.0;
        double priceAfterTax = 0.0;
        double VAT = 0.24;

        // Perform logic operations
        System.out.println("Please insert price before tax: ");
        priceBeforeTax = scanner.nextDouble();
        priceAfterTax = (1+VAT) * priceBeforeTax;

        // Display output results
        System.out.printf("The price before tax was %.2f euros and after tax %.2f euros.", priceBeforeTax, priceAfterTax);

        scanner.close();
    }
}
