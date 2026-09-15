package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Sum of number from 1 to n recursively.
 */
public class SumRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        //add(n);
        System.out.printf("The sum of numbers between 1 and %d is %d \n", n, add(n));
    }

    public static int add(int n) {
        if (n == 1) return 1;
        return n + add(n-1);
    }
}
