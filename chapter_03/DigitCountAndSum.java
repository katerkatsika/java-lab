package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives an integer and the program calculates the number of its digits
 * as well as the sum of its digits. For example if the user gives 12345 the expected output
 * is 5 digits and 1+2+3+4+5 = 15 for the sum.
 * ****    MY INITIAL SOLUTION   ******
 */
public class DigitCountAndSum {
    public static void main(String[] args) {

        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int tempNum1 = 0;
        int tempNum2 = 0;
        int i = 0;
        int j = 0;
        int div = 1;
        int divLeftRight = 0;
        int digitsSum = 0;

        // Perform logic operations
        System.out.println("Please give an integer");
        num = scanner.nextInt();
        tempNum1 = num;
        tempNum2 = num;

        while (div != 0) {
            div = tempNum1 / 10;
            tempNum1 = div;
            i++;
        }

        j = i;

        // System.out.printf("Number of digits %d \n", i);
        while(j >= 1){
            divLeftRight = tempNum2 / (int) (Math.pow(10,j-1));
            digitsSum += Math.abs(divLeftRight);
            tempNum2 = tempNum2 % (int) (Math.pow(10,j-1));
            j--;
        }

        // Display results
        System.out.printf("Number of digits for the input number %d is: %d \n",num, i);
        System.out.printf("Digits sum for the input number %d is = %d \n",num, digitsSum);

        scanner.close();
    }
}
