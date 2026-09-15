package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Returns the factorial of the first say n numbers.
 * (n is given by the user)
 */
public class Factorial {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNSize();

        result(n);
    }


    /* Methods */
    public static int getNSize () {
        int n;

        do {
            System.out.println("How many numbers you want the factorial for? (give any non-negative number");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("A negative number is NOT valid. Please try again: ");
            }
        } while (n < 0);

        return n;
    }

    public static long facto(int n) {
        long factorial = 1;

        for (int j = 1; j <= n; j++) {
            factorial *= j;
        }
        return factorial;
    }

    public static void result (int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%2d! = %,20d \n", i, facto(i));
        }
    }

}
