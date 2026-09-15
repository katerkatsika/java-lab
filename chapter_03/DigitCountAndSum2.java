package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives an integer and the program calculates the number of its digits
 * as well as the sum of its digits. For example if the user gives 12345 the expected output
 * is 5 digits and 1+2+3+4+5 = 15 for the sum.
 * ******   my solution again but closer to the simple solution of CF8   ******
 */
public class DigitCountAndSum2 {
    public static void main(String[] args) {

        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digitsCount = 0;
        int digitsSum = 0;
        int div = 1;

        // Perform logic operations
        System.out.println("Please give an integer");
        num = scanner.nextInt();

        while (div != 0) {
            digitsSum += num % 10;
            digitsCount++;
            num /=  10;
            div = num;
        }

        // Display results
        System.out.printf("The number of digit is: %d \n", digitsCount);
        System.out.printf("The sum of all digits is = %d \n", digitsSum);

        scanner.close();
    }
}
