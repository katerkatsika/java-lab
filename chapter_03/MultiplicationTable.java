package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user gives a number and the program returns its multiples from 1 to 10.
 * For example, if the user gives the number 5, then the expected output is:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * ...
 * ...
 * 5 x 10 = 50
 */
public class  MultiplicationTable {
    public static void main(String[] args) {

        // Define and Initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        // Perform logic operations
        System.out.println("Please give an integer number between 1 and 10: ");
        num = scanner.nextInt();

        while (i <= 10){
            System.out.printf("%d x %d = %d \n", num, i, num * i);
            i++;
        }
        scanner.close();
    }
}
