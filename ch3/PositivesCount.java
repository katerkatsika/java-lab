package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The program counts and sums up the input numbers from the user as long as they are positives.
 * The program stops counting when the user gives a negative number.
 */
public class  PositivesCount {
    public static void main(String[] args) {

        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int sum = 0;

        // Perform logic operations
        System.out.println("Please give a positive integer. To exit type a negative number.");
        num = scanner.nextInt();

        while (num >= 0){
            count++;
            sum += num;
            System.out.println("Enter the next positive integer. Negative to stop: ");
            num = scanner.nextInt();
        }

        // Display output/results
        System.out.printf("Positive numbers count: %d. \n", count);
        System.out.printf("The total sum is: %d.", sum);

        scanner.close();
    }
}
