package gr.aueb.cf.ch4;

/**
 * Calculates the sum and the product of the first 10 integers.
 */
public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.printf("Sum = %d, Mul = %,d", sum, mul);
    }
}
