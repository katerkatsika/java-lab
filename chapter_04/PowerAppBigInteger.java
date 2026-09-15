package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * User gives two integers for the base and the power and
 * the program calculates base^power.
 * the program takes into account that the result can
 * be out of int or evn long range of values, so it defines it as BigInteger.
 */
public class PowerAppBigInteger {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;

        System.out.println("Please enter the base and the power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result = result.multiply(BigInteger.valueOf(base));
        }

        System.out.printf("%d ^ %d = %,d \n", base, power, result);
    }
}
