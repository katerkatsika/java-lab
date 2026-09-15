package gr.aueb.cf.ch3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * User gives an integer n and the program calculates
 * with a repetition loop the factorial of this number n!.
 * for example 5! = 1 * 2 * 3 * 4 * 5 = 120.
 * (0! =1)
 * This code provides for Big numbers too, to avoid overflow in the result.
 */
public class Factorial {

    public static void main(String[] args) {

        //Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        BigInteger factorial = BigInteger.ONE;
        //int factorial = 1;
        int i = 1;

        // Perform logic operations
        System.out.println("Please give n: ");
        n = scanner.nextInt();


        while (i <= n) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }

        // B' Τρόπος
//        while (i <= n) {
//            factorial *= i;
//            i++;
//        }

        // Display result
        System.out.printf("%d! = %d", n, factorial);
    }
}
