package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives nominator and denominator and the program has to check
 * if the denominator is zero or not..
 */
public class  DivisionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int division = 0;



        while (true) {
            System.out.println("Please give the numerator: ");
            numerator = scanner.nextInt();

            System.out.println("Please give the denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator can not be zero!");
                //break;   // το break 'κόβει' όλη την while.
                continue;
            }

            division = numerator / denominator;
            System.out.printf("Dividing %d by %d we get %d. \n", numerator, denominator, division);
            break;
        }

    }
}
