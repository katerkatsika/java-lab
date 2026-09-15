package gr.aueb.cf.ch5;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

/**
 * Calculated the sum of 2 integers using a method
 */
public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Please insert 2 integers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1, num2);
        System.out.println("sum = " + sum);


    }

    /**
     * The add method, adds 2 integers.
     * @param a  the 1st integer
     * @param b  the 2nd integer
     * @return   the sum a + b
     */
    public static int add (int a, int b) {
        return a + b;
    }


//    public static int add (int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
//    }
}
