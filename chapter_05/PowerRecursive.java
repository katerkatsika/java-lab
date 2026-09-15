package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the power of a number recursively.
 */
public class PowerRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int pow;

        base = scanner.nextInt();
        pow = scanner.nextInt();

        //power(base, pow);
        System.out.println(power(base, pow));
    }

    public static int power(int base, int pow) {
//       if (pow == 0) return 1;
//       return base * power(base, pow -1);

       //or equivalently:
        return (pow == 0) ? 1 : base * power(base, pow -1);
    }
}
